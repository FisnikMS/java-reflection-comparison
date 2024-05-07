package com.fk.test;

public class Color {
  private String attribute;

  public String getAttribute() {
    return attribute;
  }

  public void setAttribute(String color) {
    this.attribute = color;
  }

  public Color(String color) {
    this.attribute = color;
  }

  @Override
  public String toString() {
    return "color: " + this.attribute;
  }
}
