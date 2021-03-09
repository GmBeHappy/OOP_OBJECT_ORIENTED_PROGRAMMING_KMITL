package oop_lab7;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gm
 */
public class Student extends Person {
    private String status;
    
    public Student() {
    }

    public Student(String status) {
        this.status = status;
    }

    public Student(String status, String name, String address, String phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" + "status=" + status + '}';
    }
    
    
}
