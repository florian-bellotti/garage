package com.garage;

import com.garage.vehicule.Vehicule;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Garage {

  private List<Vehicule> voitures;
  private String fileName;

  public Garage() {
    this.voitures = new ArrayList<>();
    this.fileName = "garage.txt";
  }

  public void addVoiture(Vehicule voiture) {
    ObjectOutputStream oos;
    try {
      oos = new ObjectOutputStream(
        new BufferedOutputStream(
          new FileOutputStream(
            new File(fileName))));
      voitures.add(voiture);
      oos.writeObject(voiture);
      oos.close();
    } catch(IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public String toString() {
    ObjectInputStream ois;
    try {
      ois = new ObjectInputStream(
        new BufferedInputStream(
          new FileInputStream(
            new File(fileName))));

      try {
        System.out.println("***************************");
        System.out.println("*  Garage OpenClassrooms  *");
        System.out.println("***************************\n");
        for (Vehicule v : voitures) {
          System.out.println(((Vehicule)ois.readObject()));
        }
      } catch (ClassNotFoundException e) {
        e.printStackTrace();
      }

      ois.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return "";
  }
}