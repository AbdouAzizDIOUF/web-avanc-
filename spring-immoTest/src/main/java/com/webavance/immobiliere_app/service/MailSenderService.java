package com.webavance.immobiliere_app.service;

import com.webavance.immobiliere_app.entity.Client;
import com.webavance.immobiliere_app.entity.EmailSender;
import com.webavance.immobiliere_app.form.ContratForm;
import com.webavance.immobiliere_app.repository.EmailSenderRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.mail.*;
import javax.mail.internet.*;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

@Service
@Transactional
public class MailSenderService {



    @Value("${gmail.username}")
    private String username;
    @Value("${gmail.password}")
    private String password;


    private final EmailSenderRepository emailSenderRepository;

    public MailSenderService(EmailSenderRepository emailSenderRepository) {
        this.emailSenderRepository = emailSenderRepository;
    }


    /**
     *
     *
     * @param emailmessage
     * @throws AddressException
     * @throws MessagingException
     * @throws IOException
     */
    public void sendmail(EmailSender emailmessage) throws AddressException, MessagingException, IOException {
        Session session = this.getServerSmtp();
        Message msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress("noReply@immo.fr", false));
        msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailmessage.getEmail()));
        msg.setSubject("Reponse "+emailmessage.getSubject());

        String content =
                "Bonjour "+emailmessage.getFirstName()+"  "
                +emailmessage.getLastName()
                +", \nNous avons bien recu votre demande, un de nos conseiller vous contactera bientot pour toutes informations concernant les services proposes par notre agence,  \n \n Bien Cordialement,";

        msg.setContent(content, "text/html");
        msg.setSentDate(new Date());

        MimeBodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setContent(content, "text/html");

        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart);
        MimeBodyPart attachPart = new MimeBodyPart();

        //attachPart.attachFile("E:\\Projets\\projet web avance\\angular\\angularTest\\src\\assets\\images\\logo.png");
        attachPart.attachFile("/var/tmp/logo.png");

        multipart.addBodyPart(attachPart);
        msg.setContent(multipart);
        // sends the e-mail
        Transport.send(msg);

    }


    /**
     *
     *
     * @param emailmessage
     * @throws AddressException
     * @throws MessagingException
     * @throws IOException
     */
    public void sendmailConfirmeContrat(ContratForm emailmessage) throws AddressException, MessagingException, IOException {

        Session session = this.getServerSmtp();

        Message msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress("noReply@immo.fr", false));
        msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailmessage.getEmailClient()));
        msg.setSubject("Confirmation de la reception de votre demande");

        String content =
                "Bonjour "+emailmessage.getFirstName()+"  "
                        +emailmessage.getLastName()
                        +", \nNous avons bien recu votre demande, Nous la traittons le plus rapidement possible, vous serez notifier apres traitement de votre demande,  \n \n Bien Cordialement,";

        msg.setSentDate(new Date());

        MimeBodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setContent(content, "text/html");

        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart);
        MimeBodyPart attachPart = new MimeBodyPart();

        //attachPart.attachFile("E:\\Projets\\projet web avance\\angular\\angularTest\\src\\assets\\images\\logo.png");
        attachPart.attachFile("/var/tmp/logo.png");
        //attachPart.attachFile("E:\\Projets\\projet web avance\\angular\\angularTest\\src\\assets\\images\\logo.png");

        multipart.addBodyPart(attachPart);
        msg.setContent(multipart);
        // sends the e-mail
        Transport.send(msg);

    }


    /**
     *
     *
     * @param client
     * @throws AddressException
     * @throws MessagingException
     * @throws IOException
     */
    public void sendmailApprouveContrat(Client client) throws AddressException, MessagingException, IOException {

        Session session = this.getServerSmtp();

        Message msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress("noReply@immo.fr", false));
        msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(client.getEmail()));
        msg.setSubject("Confirmation de la reception de votre demande");

        String content =
                "Bonjour "+client.getPrenom()+"  "
                        +client.getNom()
                        +", \nNous avons le plaisir de vous informer que votre demande a ete valide et approuve avec succes, en plus de ce mail une notification vous a ete envoye dans votre espace personneel ,  \n \n Bien Cordialement,";

        msg.setSentDate(new Date());

        MimeBodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setContent(content, "text/html");

        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart);
        MimeBodyPart attachPart = new MimeBodyPart();

        //attachPart.attachFile("E:\\Projets\\projet web avance\\angular\\angularTest\\src\\assets\\images\\logo.png");
        attachPart.attachFile("/var/tmp/logo.png");
        //attachPart.attachFile("E:\\Projets\\projet web avance\\angular\\angularTest\\src\\assets\\images\\logo.png");

        multipart.addBodyPart(attachPart);
        msg.setContent(multipart);
        // sends the e-mail
        Transport.send(msg);

    }

    /**
     *
     *
     * @param client
     * @throws AddressException
     * @throws MessagingException
     * @throws IOException
     */
    public void sendmailRejetContrat(Client client) throws AddressException, MessagingException, IOException {

        Session session = this.getServerSmtp();

        Message msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress("noReply@immo.fr", false));
        msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(client.getEmail()));
        msg.setSubject("Reponse a votre demande de contart chez immo agence");

        String content =
                "Bonjour "+client.getPrenom()+"  "
                        +client.getNom()
                        +", \nApres traittement de votre demande, nous avons le regret de vous informer que votre demande n'a pas ete approuve. Pour toute information supplementaire veiller contacter le service commerciale de L'immo Agence ,  \n \n Bien Cordialement,";

        msg.setSentDate(new Date());

        MimeBodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setContent(content, "text/html");

        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart);
        MimeBodyPart attachPart = new MimeBodyPart();

        //attachPart.attachFile("E:\\Projets\\projet web avance\\angular\\angularTest\\src\\assets\\images\\logo.png");
        attachPart.attachFile("/var/tmp/logo.png");
        //attachPart.attachFile("E:\\Projets\\projet web avance\\angular\\angularTest\\src\\assets\\images\\logo.png");

        multipart.addBodyPart(attachPart);
        msg.setContent(multipart);
        // sends the e-mail
        Transport.send(msg);

    }


    /**
     *
     * @return
     */
    private Session getServerSmtp(){
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        return session;
    }

}
