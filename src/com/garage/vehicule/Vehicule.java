package com.garage.vehicule;

import com.garage.moteur.Moteur;
import com.garage.option.Option;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Vehicule implements Serializable {

  private Double prix;
  private String nom;
  private List<Option> listOption;
  private Marque nomMarque;
  private Moteur moteur;

  public Vehicule(Double prix, String nom, Marque nomMarque) {
    this.prix = prix;
    this.nom = nom;
    this.listOption = new ArrayList<>();
    this.nomMarque = nomMarque;
  }

  public void setMoteur(Moteur moteur) {
    this.moteur = moteur;
  }

  public void addOption(Option option) {
    listOption.add(option);
  }

  public Double getPrix() {
    return prix;
  }

  public List<Option> getListOption() {
    return listOption;
  }

  public Marque getMarque() {
    return nomMarque;
  }

  @Override
  public String toString() {
    return "Vehicule{" +
      "prix=" + prix +
      ", nom='" + nom + '\'' +
      ", listOption=" + listOption +
      ", nomMarque=" + nomMarque +
      '}';
  }
}