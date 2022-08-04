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
public class Projet implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @Lob
    private String description;
    private Date dateDebut;
    private Date dateFin;

    @OneToMany(mappedBy = "projet")
    private Collection<Bien> biens;
}
