package com.fk.test;

import java.util.ArrayList;

public class Car {
  private String name;
  private Integer buildYear;
  private ArrayList<String> previousHolders = new ArrayList<>();
  private Color carColor;

  public Car(String name, Integer buildYear, ArrayList<String> previousHolders, Color color) {
    this.name = name;
    this.buildYear = buildYear;
    this.previousHolders = previousHolders;
    this.carColor = color;
  }

  public Color getCarColor() {
    return carColor;
  }

  public void setCarColor(Color color) {
    this.carColor = color;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getBuildYear() {
    return buildYear;
  }

  public void setBuildYear(Integer buildYear) {
    this.buildYear = buildYear;
  }

  public ArrayList<String> getPreviousHolders() {
    return previousHolders;
  }

  public void setPreviousHolders(ArrayList<String> previousHolders) {
    this.previousHolders = previousHolders;
  }

}
