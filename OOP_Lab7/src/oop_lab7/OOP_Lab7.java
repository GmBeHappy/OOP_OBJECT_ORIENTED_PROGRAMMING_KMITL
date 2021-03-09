/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_lab7;
import java.util.Scanner;

/**
 *
 * @author Gm
 */
public class OOP_Lab7 {
    public static void main(String[] args) {
        testPerson();
    }
    public static void testPerson(){
        
        System.out.println("[1] : Student");
        System.out.println("[2] : Faculty");
        System.out.println("[3] : Staff");
        
        Scanner inputName = new Scanner(System.in);
	Scanner inputAddress = new Scanner(System.in);
	Scanner inputPhoneNumber = new Scanner(System.in);
	Scanner inputEmailAddress = new Scanner(System.in);
        Scanner inputMode = new Scanner(System.in);
        Scanner inputStatus = new Scanner(System.in);
        Scanner inputOffice = new Scanner(System.in);
        Scanner inputSalary = new Scanner(System.in);
        Scanner inputOfficeHour = new Scanner(System.in);
        Scanner inputRank = new Scanner(System.in);
        Scanner inputTitle = new Scanner(System.in);
        
	
        String name,address,phoneNumber,emailAddress,office,rank,title;
        int mode,status;
        Double officeHour,salary;
        
        System.out.print("Select Mode : ");
        mode = inputMode.nextInt();
        
        System.out.print("Enter name : ");
        name = inputName.nextLine().trim();
        System.out.print("Enter address : ");
        address = inputAddress.nextLine().trim();
        System.out.print("Enter phone number : ");
        phoneNumber = inputPhoneNumber.nextLine().trim();
        System.out.print("Enter email : ");
        emailAddress = inputEmailAddress.nextLine().trim();
        Person p = new Person(name, address, phoneNumber, emailAddress);
        
        switch (mode){
            case 1:
                System.out.println("[1] : freshman \n[2] : sophomore\n[3] : junior\n[4] : senior");
                System.out.print("Enter status [1-4] : ");
                status = inputStatus.nextInt();
                String sstatus = "";
                switch (status){
                    case 1:
                        sstatus = "freshman";
                        break;
                    case 2:
                        sstatus = "sophomore";
                        break;
                    case 3:
                        sstatus = "junior";
                        break;
                    case 4:
                        sstatus = "senior";
                        break;
                }
                Student s = new Student(sstatus, p.getName(), p.getAddress(), p.getPhoneNumber(), p.getEmailAddress());
                System.out.println(s.toString());
                break;
            
            case 2:
                System.out.print("Enter office : ");
                office = inputOffice.nextLine().trim();
                System.out.print("Enter salary : ");
                salary = inputSalary.nextDouble();
                System.out.print("Enter office hour : ");
                officeHour = inputOfficeHour.nextDouble();
                System.out.print("Enter rank : ");
                rank = inputRank.nextLine().trim();
                Employee e = new Employee(office, salary, p.getName(), p.getAddress(), p.getPhoneNumber(), p.getEmailAddress());
                Faculty f = new Faculty(officeHour, rank, e.getOffice(), e.getSalary(), p.getName(), p.getAddress(), p.getPhoneNumber(), p.getEmailAddress());
                System.out.println(f.toString());
                break;
                
            case 3:
                System.out.print("Enter office : ");
                office = inputOffice.nextLine().trim();
                System.out.print("Enter salary : ");
                salary = inputSalary.nextDouble();
                System.out.print("Enter title : ");
                title = inputRank.nextLine().trim();
                Employee e2 = new Employee(office, salary, p.getName(), p.getAddress(), p.getPhoneNumber(), p.getEmailAddress());
                Staff f2 = new Staff(title, e2.getOffice(), e2.getSalary(), p.getName(), p.getAddress(), p.getPhoneNumber(), p.getEmailAddress());
                System.out.println(f2.toString());
                break;
        }
        
    }
}
