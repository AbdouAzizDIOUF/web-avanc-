package com.webavance.immobiliere_app.entity;


import lombok.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Entity
@NoArgsConstructor @AllArgsConstructor @Data @ToString
@DiscriminatorValue("ENTREPRISE")
public class Entreprise extends Client{

    private String siret;
    private String typeEntreprise;
    private String secteurActity;
    private String description;
}
