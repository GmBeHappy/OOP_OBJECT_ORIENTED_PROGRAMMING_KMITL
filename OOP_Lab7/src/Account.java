
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gm
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    Date dateCreated;

    public Account() {
	this.id = 0;
	this.balance = 0;
	this.annualInterestRate = 0;
	this.dateCreated = new Date();
    }
	
    public Account(int id, double balance) {
	this.id = id;
	this.balance = balance;
	this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }
    
    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }    
    
}
