package com.webavance.immobiliere_app.form;

import lombok.*;

@AllArgsConstructor @Data @NoArgsConstructor @ToString
public class ContratForm {

    private String idClient;
    private String firstName;
    private String lastName;
    private String emailClient;
    private String dateDebut;
    private String dateFin;
    private Long idBien;
    private String typeClient;
}
