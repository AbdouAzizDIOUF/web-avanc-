package com.webavance.immobiliere_app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
@NoArgsConstructor @AllArgsConstructor @Data @ToString
public class Paiement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String moyenPaiement;
    private Date datePaiement;
    private boolean estAcceptee;

    @ManyToOne
    private ContratClientBien contratClientBien;
}
