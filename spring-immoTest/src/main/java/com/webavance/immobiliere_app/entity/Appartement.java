package com.webavance.immobiliere_app.entity;

import lombok.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@NoArgsConstructor @AllArgsConstructor @Data @ToString
@DiscriminatorValue("APPARTEMENT")
public class Appartement extends Bien{

    private int etage;
    private int nombrePieces;
}
