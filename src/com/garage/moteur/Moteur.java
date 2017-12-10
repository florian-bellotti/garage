package com.garage.moteur;

import java.io.Serializable;

public abstract class Moteur implements Serializable {

  public TypeMoteur type;
  private String cylindre;
  private Double prix;

  public Moteur(String cylindre, Double prix) {
    this.cylindre = cylindre;
    this.prix = prix;
  }

  public Double getPrix() {
    return prix;
  }

  @Override
  public String toString() {
    return "Moteur{" +
      "type=" + type +
      ", cylindre='" + cylindre + '\'' +
      ", prix=" + prix +
      '}';
  }
}