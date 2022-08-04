package com.webavance.immobiliere_app.entity;

import lombok.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Entity
@NoArgsConstructor @AllArgsConstructor @Data @ToString
@DiscriminatorValue("VILLA")
public class Villa extends Bien{

    private int etage;
    private int nombrePiece;
}
