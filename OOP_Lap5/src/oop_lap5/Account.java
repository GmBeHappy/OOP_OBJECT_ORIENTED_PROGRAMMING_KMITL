package OOP_Lap5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Date;
import java.lang.IllegalArgumentException;
/**
 *
 * @author Gm
 */
public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
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
		return this.id;
	}
	
	public void setId(int id) {
		if (id < 0 || id > Integer.MAX_VALUE) 
			throw new IllegalArgumentException("Invalid id.");
		this.id = id;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getAnnualInterestRate() {
		return this.annualInterestRate;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public Date getDateCreated() {
		return this.dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		return this.annualInterestRate/12;
	}
	
	public double getMonthlyInterest() {
		return (this.balance * this.getMonthlyInterestRate())/100;
	}
	
	public void withdraw(double amount) {
		if (amount < 0.0 || amount > Double.MAX_VALUE) 
			throw new IllegalArgumentException("Invalid withdraw amount.");
		if (this.balance - amount < 0)
			throw new IllegalArgumentException("You money not enough, please try to withdraw lower amount of money.");
		this.balance -= amount;
	}
	
	public void deposit(double amount) {
		if (amount < 0.0 || amount > Double.MAX_VALUE) 
			throw new IllegalArgumentException("Invalid deposit amount.");
		this.balance += amount;
	}
}
