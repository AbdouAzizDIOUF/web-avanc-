package com.webavance.immobiliere_app.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@NoArgsConstructor @AllArgsConstructor @Data @ToString
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_CLIENT", discriminatorType= DiscriminatorType.STRING, length = 15)
public abstract class Client implements Serializable {

    @Id
    private String id;
    private String nom;
    private String prenom;
    private String email;
    private String adresse;
    private String numTel;
    private String ville;
    private String codePostal;

    @OneToMany(mappedBy = "client")
    private Collection<ContratClientBien> contratClientBiens;

}
