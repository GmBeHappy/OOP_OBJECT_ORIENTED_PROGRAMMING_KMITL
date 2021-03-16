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
public class SavingAccount extends Account {

    public SavingAccount() {
    }

    public SavingAccount(int id, double balance) {
        super(id, balance);
    }
    
    @Override
    public String toString() {
        return super.toString()+"SavingAccount{" + '}';
    }
}
