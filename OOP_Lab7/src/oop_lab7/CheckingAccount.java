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
public class CheckingAccount extends Account{
    double overDraft;

    public CheckingAccount(double overDraft) {
        this.overDraft = overDraft;
    }

    public CheckingAccount(double overDraft, int id, double balance) {
        super(id, balance);
        this.overDraft = overDraft;
    }

    public double getOverDraft() {
        return overDraft;
    }

    public void setOverDraft(double overDraft) {
        this.overDraft = overDraft;
    }

    @Override
    public void withdraw(double value){
        if((getBalance() - value )*-1 <= overDraft){
            setBalance(getBalance() - value);
        }
        else{
            System.out.println("Error! withdraw over the limit");
        }
    }

    @Override
    public String toString() {
        return super.toString()+"CheckingAccount{" + "overDraft=" + overDraft + '}';
    }
    
}
