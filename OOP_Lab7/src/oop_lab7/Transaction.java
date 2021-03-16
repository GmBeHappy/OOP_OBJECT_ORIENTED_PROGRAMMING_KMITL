/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_lab7;
import java.util.Date;
/**
 *
 * @author Gm
 */
class Transaction {
  private Date date;
  private char type;

  private double amount;
  private double balance;
  private String description;

  public Transaction(char type, double amount, double balance, String description) {
    this.type = type;
    this.amount = amount;
    this.balance = balance;
    this.description = description;
    this.date = new Date();
  }

  public Date getDate() {
    return this.date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public char getType() {
    return this.type;
  }

  public void setType(char type) {
    this.type = type;
  }

  public double getAmount() {
    return this.amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public double getBalance() {
    return this.balance;
  }

  public void setbalance(double balance) {
    this.balance = balance;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
