package oop_lab7;


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
public class Faculty extends Employee {
    private Double officeHour;
    private String rank;

    public Faculty(Double officeHour, String rank, String office, Double salary) {
        super(office, salary);
        this.officeHour = officeHour;
        this.rank = rank;
    }

    public Faculty(Double officeHour, String rank, String office, Double salary, String name, String address, String phoneNumber, String emailAddress) {
        super(office, salary, name, address, phoneNumber, emailAddress);
        this.officeHour = officeHour;
        this.rank = rank;
    }

   

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Double getOfficeHour() {
        return officeHour;
    }

    public void setOfficeHour(Double officeHour) {
        this.officeHour = officeHour;
    }

    @Override
    public String toString() {
        return super.toString() + "Faculty{" + "officeHour=" + officeHour + ", rank=" + rank + '}';
    }
    
}
