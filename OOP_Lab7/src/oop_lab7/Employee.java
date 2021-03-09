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
public class Employee extends Person{
    private String office;
    private Double salary;
    private Date dateHired;

    public Employee(String office, Double salary) {
        this.office = office;
        this.salary = salary;
        this.dateHired = new Date();
    }

    public Employee(String office, Double salary, String name, String address, String phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = new Date();
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return super.toString() + "Employee{" + "office=" + office + ", salary=" + salary + ", dateHired=" + dateHired + '}';
    }
    
}
