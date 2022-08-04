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
@AllArgsConstructor @Data @ToString
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_BIEN", discriminatorType= DiscriminatorType.STRING, length = 20)
public abstract class Bien implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private Double surface;
    private Double price;
    @Lob
    private String description;
    private String status;
    private String adresse;
    private String codePostal;
    private String ville;
    private Float latitude;
    private Float longitude;
    private Date dateCreation;
    private boolean avaible;
    private String image1;
    private String image2;
    private String image3;
    private String image4;

    public Bien(){
        this.dateCreation = new Date();
        this.avaible = true;
        this.status = "A louer";
    }

    @ManyToOne
    private Projet projet;

    @OneToMany(mappedBy = "bien")
    private Collection<ContratClientBien> contratClientBiens;
}
