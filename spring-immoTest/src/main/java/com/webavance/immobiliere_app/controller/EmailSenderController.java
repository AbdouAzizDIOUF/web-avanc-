package com.webavance.immobiliere_app.controller;

import com.webavance.immobiliere_app.entity.EmailSender;
import com.webavance.immobiliere_app.repository.EmailSenderRepository;
import com.webavance.immobiliere_app.service.MailSenderService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.mail.*;
import javax.mail.internet.*;
import java.io.IOException;


@CrossOrigin("*")
@RestController
@RequestMapping("/mail/")
public class EmailSenderController {

    @Value("${gmail.username}")
    private String username;
    @Value("${gmail.password}")
    private String password;

    private final MailSenderService mailSenderService;
    private final EmailSenderRepository emailSenderRepository;


    public EmailSenderController(MailSenderService mailSenderService, EmailSenderRepository emailSenderRepository) {
        this.mailSenderService = mailSenderService;
        this.emailSenderRepository = emailSenderRepository;
    }


    /**
     *
     *
     * @param emailSender
     * @return
     * @throws MessagingException
     * @throws IOException
     */
    @PostMapping("/send")
    public String sendEmail(@RequestBody EmailSender emailSender) throws MessagingException, IOException {

         EmailSender clientMail;
         clientMail = this.emailSenderRepository.save(emailSender);

        this.mailSenderService.sendmail(clientMail);

        return "Email sent successfully";
    }



}