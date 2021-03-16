/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_lab7;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Gm
 */
public class Account2 extends Account{
    private String name;
    private ArrayList<Transaction> transactions;

    public Account2(String name) {
        this.name = name;
        this.transactions = new ArrayList<Transaction>();
    }

    public Account2(String name, int id, double balance) {
        super(id, balance);
        this.name = name;
        this.transactions = new ArrayList<Transaction>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }
    
    public void withdraw(double amount, String description) {
        if(amount <= getBalance()){
            setBalance(getBalance() - amount);
        }
        else{
            System.out.println("Error");
        }
        Transaction transaction = new Transaction('W', amount, this.getBalance(), description);

        this.transactions.add(transaction);
    }

    public void deposit(double amount) {
        if(amount>=0){
            setBalance(getBalance() + amount);
        }
        else{
            System.out.println("Error!");
        }
    }

    public void deposit(double amount, String description) {
        if(amount>=0){
            setBalance(getBalance() + amount);
            Transaction transaction = new Transaction('D', amount, this.getBalance(), description);

            this.transactions.add(transaction);
        }
        else{
            System.out.println("Error!");
        }
        
    }
    
}
