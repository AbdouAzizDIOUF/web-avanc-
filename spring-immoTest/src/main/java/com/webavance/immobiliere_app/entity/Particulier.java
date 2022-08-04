package com.webavance.immobiliere_app.entity;

import com.sun.org.apache.xalan.internal.xsltc.dom.SimpleResultTreeImpl;
import lombok.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;


@EqualsAndHashCode(callSuper = true)
@Entity
@NoArgsConstructor @AllArgsConstructor @Data @ToString
@DiscriminatorValue("PARTICULIER")
public class Particulier extends Client {

    private String cni;
    private Date dateNaiss;
    private String sexe;
}
