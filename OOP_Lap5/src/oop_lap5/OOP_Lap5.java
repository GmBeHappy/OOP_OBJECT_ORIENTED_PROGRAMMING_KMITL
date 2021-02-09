/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_lap5;
import OOP_Lap5.Account;
import OOP_Lap5.RegularPolygon;
import java.util.Scanner;
/**
 *
 * @author Gm
 */
public class OOP_Lap5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //testAccount();
        testRegularPolygon();
    }
    public static void testAccount() {
        System.out.println("\tCreate Account");
        System.out.println("-------------------------------");
        
        int account_id;
        System.out.print("Enter Account ID : ");
        Scanner input = new Scanner(System.in);
        account_id = input.nextInt();
        
        double account_balance;
        System.out.print("Enter Account Balance : ");
        Scanner input2 = new Scanner(System.in);
        account_balance = input2.nextDouble();
        
        double account_annualInterestRate;
        System.out.print("Enter AnnualInterestRate : ");
        Scanner input3 = new Scanner(System.in);
        account_annualInterestRate = input3.nextDouble();
        
        Account account = new Account(account_id, account_balance);
        account.setAnnualInterestRate(account_annualInterestRate);
        printStatement(account);
        
        System.out.println("\twithdraw");
        System.out.println("-------------------------------");
        
        double withdraw;
        System.out.print("Enter Withdraw : ");
        Scanner input4 = new Scanner(System.in);
        withdraw = input4.nextDouble();
	account.withdraw(withdraw);
        printStatement(account);
        
        System.out.println("\twithdraw");
        System.out.println("-------------------------------");
        
        double deposit;
        System.out.print("Enter Deposit : ");
        Scanner input5 = new Scanner(System.in);
        deposit = input5.nextDouble();
	account.deposit(deposit);
        printStatement(account);
        	
    }
    public static void printStatement(Account account){
        System.out.println("\tStatement");
        System.out.println("-------------------------------");
        System.out.println("Balance : " + account.getBalance());
	System.out.println("Monthly interest : " + account.getMonthlyInterest());
	System.out.println("Date created : " + account.getDateCreated().toString());		
    }
	
    public static void testRegularPolygon() {
	RegularPolygon rp_1 = new RegularPolygon();
	RegularPolygon rp_2 = new RegularPolygon(6, 4);
	RegularPolygon rp_3 = new RegularPolygon(10, 4, 5.6, 7.8);
		
	System.out.println("RegularPolygon()");
	displayPolygon(rp_1);
		
	System.out.println("RegularPolygon(6, 4)");
	displayPolygon(rp_2);
		
	System.out.println("RegularPolygon(10, 4, 5.6, 7.8)");
	displayPolygon(rp_3);
    }
	
    private static void displayPolygon(RegularPolygon rp) {
	System.out.println("Perimeter : " + rp.getPerimeter());
	System.out.println("Area : " + rp.getArea());
	System.out.println("-------------------------------");
    } 

}
