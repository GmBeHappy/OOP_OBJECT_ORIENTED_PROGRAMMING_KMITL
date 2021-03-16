/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_lab7;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Gm
 */
public class OOP_Lab7 {
    public static void main(String[] args) {
        testAccount();
        //testAccount2();
        //testPerson();
    }
    
    public static void testAccount(){
        System.out.println("[1] : Saving Account");
        System.out.println("[2] : Checking Account");
        
        Scanner input = new Scanner(System.in);
        
        int mode,id;
        double balance,overDraft,withdraw;
        
        System.out.print("Select Mode : ");
        mode = input.nextInt();
        
        System.out.print("Input id : ");
        id = input.nextInt();
        System.out.print("Input balance : ");
        balance = input.nextDouble();
        Account p1 = new Account(id, balance);
        
        switch (mode){
            case 1:
                SavingAccount __p1 = new SavingAccount(p1.getId(), p1.getBalance());
                System.out.println(__p1.toString());
                System.out.print("Id : ");
                System.out.println(__p1.getId());
                System.out.print("Balance : ");
                System.out.println(__p1.getBalance());
                System.out.print("AnnualInterestRate : ");
                System.out.println(__p1.getAnnualInterestRate());
                
                System.out.print("Input withdraw : ");
                withdraw = input.nextDouble();
                
                __p1.withdraw(withdraw);
                
                System.out.print("Id : ");
                System.out.println(__p1.getId());
                System.out.print("Balance : ");
                System.out.println(__p1.getBalance());
                System.out.print("AnnualInterestRate : ");
                System.out.println(__p1.getAnnualInterestRate());
                break;
            case 2:
                System.out.print("Input overDraft : ");
                overDraft = input.nextDouble();
                CheckingAccount _p1 = new CheckingAccount(overDraft, p1.getId(), p1.getBalance());
                System.out.println(_p1.toString());
                System.out.print("Id : ");
                System.out.println(_p1.getId());
                System.out.print("Balance : ");
                System.out.println(_p1.getBalance());
                System.out.print("AnnualInterestRate : ");
                System.out.println(_p1.getAnnualInterestRate());
                
                System.out.print("Input withdraw : ");
                withdraw = input.nextDouble();
                _p1.withdraw(withdraw);
                System.out.println(_p1.toString());
                System.out.print("Id : ");
                System.out.println(_p1.getId());
                System.out.print("Balance : ");
                System.out.println(_p1.getBalance());
                System.out.print("AnnualInterestRate : ");
                System.out.println(_p1.getAnnualInterestRate());
                break;
        }
        
    }
    
    public static void testAccount2(){
        Account2 newact = new Account2("gm", 1, 5000);
        System.out.println("Name : " + newact.getName());
        System.out.println("Account ID : " + newact.getId());
        System.out.println("Annual interest Rate : " + newact.getAnnualInterestRate());
        
        newact.deposit(30.0,"d30");
        newact.deposit(40.0,"d40");
        newact.deposit(50.0,"530");
        newact.withdraw(5,"w5");
        newact.withdraw(4,"w4");
        newact.withdraw(10000,"w2");
        
        System.out.println("Name: " + newact.getName());
        System.out.println("Account ID: " + newact.getId());
        System.out.printf("Annual interest rate: %.2f\n", newact.getAnnualInterestRate());
        System.out.printf("Balance: %.1f\n", newact.getBalance());
        printTransactions(newact.getTransactions());
        
    }
    
    public static void printTransactions(ArrayList<Transaction> transactions) {
        System.out.printf("Date\t\t\t\tType\tAmount\tBalance\n");

        for (int i = 0; i < transactions.size(); i++) {
          Transaction transaction = transactions.get(i);
          String date = transaction.getDate().toString();
          char type = transaction.getType();
          double amount = transaction.getAmount();
          double balance = transaction.getBalance();

          System.out.printf("%s\t%c\t%.1f\t%.1f\n", date, type, amount, balance);
        }
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
