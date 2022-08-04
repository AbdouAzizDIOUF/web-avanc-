package com.webavance.immobiliere_app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

/**
 * @author abdou diouf
 */
@Entity
@NoArgsConstructor @AllArgsConstructor @Data @ToString
public class ContratClientBien implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    @Lob
    private String description;
    private Date dateDebut;
    private Date dateFin;
    private boolean estRetenue;

    @ManyToOne
    private Client client;

    @ManyToOne
    private Bien bien;

    @OneToMany(mappedBy = "contratClientBien")
    private Collection<Paiement> paiements;

}
