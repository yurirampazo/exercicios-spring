package com.springproject.exercicios.model.entities;


public class Customer {

  private int id;
  private String name;
  private String docNumber;

  public Customer(int id, String name, String docNumber) {
    this.id = id;
    this.name = name;
    this.docNumber = docNumber;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDocNumber() {
    return docNumber;
  }

  public void setDocNumber(String docNumber) {
    this.docNumber = docNumber;
  }
}
