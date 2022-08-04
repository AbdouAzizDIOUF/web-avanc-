package com.webavance.immobiliere_app.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@DiscriminatorValue("STUDIO")
public class Studio extends Bien{
    private String salledeBain;
}
