package com.webavance.immobiliere_app.service;


import com.webavance.immobiliere_app.entity.*;
import com.webavance.immobiliere_app.form.ContratClientBienForm;
import com.webavance.immobiliere_app.form.ContratForm;
import com.webavance.immobiliere_app.repository.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.mail.MessagingException;
import java.io.IOException;
import java.util.Date;

@Service
@Transactional
public class ContratService {

    private final ContratClientBienRepository contratClientBienRepository;
    private final ClientRepository clientRepository;
    private final BienRepository bienRepository;
    private final ParticulierRepository particulierRepository;
    private final EntrepriseRepository entrepriseRepository;
    private final MailSenderService mailSenderService;

    public ContratService(ContratClientBienRepository contratClientBienRepository, ClientRepository clientRepository, BienRepository bienRepository, ParticulierRepository particulierRepository, EntrepriseRepository entrepriseRepository, MailSenderService mailSenderService) {
        this.contratClientBienRepository = contratClientBienRepository;
        this.clientRepository = clientRepository;
        this.bienRepository = bienRepository;
        this.particulierRepository = particulierRepository;
        this.entrepriseRepository = entrepriseRepository;
        this.mailSenderService = mailSenderService;
    }


    /**
     *
     *
     * @param contratForm
     * @return
     */
    public ContratClientBien saveContrat(ContratForm contratForm){
        Particulier particulier = null;
        Entreprise entreprise = null;
        ContratClientBien contratClientBien = new ContratClientBien();

        Bien bien = bienRepository.findById(contratForm.getIdBien()).get();

        if (!clientRepository.findById(contratForm.getIdClient()).isPresent())
        {
            if ("particulier".equals(contratForm.getTypeClient())){
                Particulier p = new Particulier();
                p.setId(contratForm.getIdClient());
                p.setEmail(contratForm.getEmailClient());
                p.setPrenom(contratForm.getFirstName());
                p.setNom(contratForm.getLastName());
                particulier = particulierRepository.save(p);

                contratClientBien.setClient(particulier);

            }else {
                Entreprise p = new Entreprise();
                p.setId(contratForm.getIdClient());
                p.setEmail(contratForm.getEmailClient());
                p.setPrenom(contratForm.getFirstName());
                p.setNom(contratForm.getLastName());
                entreprise = entrepriseRepository.save(p);

                contratClientBien.setClient(entreprise);
            }
        }else{
            Client client = clientRepository.findById(contratForm.getIdClient()).get();
            contratClientBien.setBien(bien);
            contratClientBien.setClient(client);
        }

        System.out.println(bien.getStatus());
        if("A louer".equals(bien.getStatus())){
            contratClientBien.setType("location");
        }
        if("A vendre".equals(bien.getStatus())){
            contratClientBien.setType("ventes");
        }
        contratClientBien.setDateDebut(new Date());
        contratClientBien.setBien(bien);

        return contratClientBienRepository.save(contratClientBien);
    }

    /**
     *
     *
     * @param contratClientBienForm
     * @throws IOException
     * @throws MessagingException
     */
    public void approuveContrat(ContratClientBienForm contratClientBienForm) throws IOException, MessagingException {
        ContratClientBien c = this.contratClientBienRepository.findById(contratClientBienForm.getIdContrat()).get();
        c.setEstRetenue(true);
        this.contratClientBienRepository.save(c);
        Bien b = this.bienRepository.findById(contratClientBienForm.getIdBien()).get();
        b.setAvaible(false);
        this.bienRepository.save(b);
        Client client = this.clientRepository.findById(contratClientBienForm.getIdClient()).get();
        this.mailSenderService.sendmailApprouveContrat(client);

    }


    /**
     *
     *
     * @param id
     */
    public void deleteContrat(Long id) throws IOException, MessagingException {
        ContratClientBien c = this.contratClientBienRepository.findById(id).get();
        Client client = c.getClient();
        this.contratClientBienRepository.deleteById(id);
        mailSenderService.sendmailRejetContrat(client);
    }
}
