package com.webavance.immobiliere_app.controller;


import com.webavance.immobiliere_app.entity.ContratClientBien;
import com.webavance.immobiliere_app.form.ContratClientBienForm;
import com.webavance.immobiliere_app.form.ContratForm;
import com.webavance.immobiliere_app.service.ContratService;
import com.webavance.immobiliere_app.service.MailSenderService;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;
import java.io.IOException;


@CrossOrigin("*")
@RestController
@RequestMapping("/contrats/")
public class ContratController {

    private final ContratService contratService;
    private final MailSenderService mailSenderService;

    public ContratController(ContratService contratService, MailSenderService mailSenderService) {
        this.contratService = contratService;
        this.mailSenderService = mailSenderService;
    }

    /**
     *
     *
     * @param contratForm
     * @throws IOException
     * @throws MessagingException
     */
    @PostMapping("/appartement")
    public void saveContrat(@RequestBody ContratForm contratForm) throws IOException, MessagingException {
         System.out.println(contratForm.toString());
        ContratClientBien c = this.contratService.saveContrat(contratForm);
        if (c!=null){
            this.mailSenderService.sendmailConfirmeContrat(contratForm);
        }
    }

    /**
     *
     *
     * @param contratClientBienForm
     * @throws IOException
     * @throws MessagingException
     */
    @PostMapping("/approuveContrat")
    public void approuveContrat(@RequestBody ContratClientBienForm contratClientBienForm) throws IOException, MessagingException {
        this.contratService.approuveContrat(contratClientBienForm);
    }

    /**
     *
     *
     * @param id
     */
    @PostMapping("/rejeteContrat/{id}")
    public void rejetContrat(@PathVariable("id") Long id) throws IOException, MessagingException {
        this.contratService.deleteContrat(id);
    }

}
