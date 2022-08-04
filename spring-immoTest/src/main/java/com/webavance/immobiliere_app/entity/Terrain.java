package com.webavance.immobiliere_app.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;



@Entity
@DiscriminatorValue("TERRAIN")
public class Terrain extends Bien{
}
