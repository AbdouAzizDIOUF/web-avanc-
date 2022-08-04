package com.webavance.immobiliere_app.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class ContratClientBienForm {

    private Long idContrat;
    private Long idBien;
    private String idClient;
}
