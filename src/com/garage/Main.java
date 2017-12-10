package com.garage;

import com.garage.moteur.MoteurElectrique;
import com.garage.moteur.MoteurEssence;
import com.garage.option.*;
import com.garage.vehicule.A300B;
import com.garage.vehicule.Lagouna;
import com.garage.vehicule.Vehicule;

public class Main {
  public static void main(String[] args) {
    Garage garage = new Garage();
    System.out.println(garage);

    Vehicule lag1 = new Lagouna();
    lag1.setMoteur(new MoteurEssence("150 Chevaux", 10256d));
    lag1.addOption(new GPS());
    lag1.addOption(new SiegeChauffant());
    lag1.addOption(new VitreElectrique());
    garage.addVoiture(lag1);

    Vehicule A300B_2 = new A300B();
    A300B_2.setMoteur(new MoteurElectrique("1500 W", 1234d));
    A300B_2.addOption(new Climatisation());
    A300B_2.addOption(new BarreDeToit());
    A300B_2.addOption(new SiegeChauffant());
    garage.addVoiture(A300B_2);

    garage.toString();
  }
}