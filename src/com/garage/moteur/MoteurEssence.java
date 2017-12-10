package com.garage.moteur;

public class MoteurEssence extends Moteur {

  public MoteurEssence(String cylindre, Double prix) {
    super(cylindre, prix);
    this.type = TypeMoteur.ESSENCE;
  }
}
