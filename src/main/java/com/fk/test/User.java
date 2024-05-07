package com.fk.test;

import java.util.ArrayList;
import java.util.HashMap;

public class User {
  public String name;
  private String secondName;
  private Integer age;

  private HashMap<String, Object> hash = new HashMap<String, Object>();
  public HashMap<String, Car> carMap = new HashMap<String, Car>();
  private ArrayList<String> countries = new ArrayList<>();

  private Car car;

  public User(String name, String secondName, Integer age, HashMap<String,Object> hash, ArrayList<String> countries,
      Car car) {
    this.name = name;
    this.secondName = secondName;
    this.age = age;
    this.hash = hash;
    this.countries = countries;
    this.car = car;
  }

  public HashMap<String, Object> getHash() {
    return hash;
  }

  public void setHash(HashMap<String, Object> hash) {
    this.hash = hash;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSecondName() {
    return secondName;
  }

  public void setSecondName(String secondName) {
    this.secondName = secondName;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public ArrayList<String> getCountries() {
    return this.countries;
  }

  public void setCountries(ArrayList<String> countries) {
    this.countries = countries;
  }

  public Car getCar() {
    return this.car;
  }

  public void setCar(Car car) {
    this.car = car;
  }

}
