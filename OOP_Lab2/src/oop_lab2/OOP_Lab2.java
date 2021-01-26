/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_lab2;

import java.util.Scanner;
/**
 *
 * @author Gm
 */
public class OOP_Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ex1();
        //ex2();
        //ex3();
        //ex4();
    }
    
    public static void ex1(){
        int today;
        while(true){
            System.out.print("Enter today's day : ");
            Scanner input = new Scanner(System.in);
            today = input.nextInt();
            if(today<=6 && today>=0){
                break;
            }
        }
        System.out.print("Enter the number of days elapsed since today: ");
        Scanner input2 = new Scanner(System.in);
        int number = input2.nextInt();
        
        String days[]={"Sunday","Monday","Tuseday","Wednesday","Thurday","Friday","Saturday"};
        System.out.println("Today is " + days[today] + " and the future day is " + days[today+(number%7)] );
        //System.out.println(currentPop);
    }
    
    public static void ex2(){
        int player;
        String symbols[] = {"scissor", "rock", "paper"};
        while(true){
            System.out.print("scissor (0), rock (1), paper (2) : ");
            Scanner input = new Scanner(System.in);
            player = input.nextInt();
            if(player<=2 && player>=0){
                break;
            }
        }
        int randomInt = (int)(Math.random()*3);
        String playerSymbol = symbols[player];
	String botSymbol = symbols[randomInt];
        switch (playerSymbol) {
			case "scissor":
				if (botSymbol.equals(playerSymbol)) {
                                    System.out.println("The computer is " + botSymbol + ". You are " + playerSymbol + " too. It is a draw");
                                }
				if (botSymbol.equals("rock")) {
                                    System.out.println("The computer is " + botSymbol + ". You are " + playerSymbol + ". You lose" );
                                }
				if (botSymbol.equals("paper")) {
                                    System.out.println("The computer is " + botSymbol + ". You are " + playerSymbol + ". You win" );
                                }
				break;
			case "rock":
				if (botSymbol.equals(playerSymbol)){
                                    System.out.println("The computer is " + botSymbol + ". You are " + playerSymbol + " too. It is a draw");
                                }
				if (botSymbol.equals("scissor")) {
                                    System.out.println("The computer is " + botSymbol + ". You are " + playerSymbol + ". You win" );
                                }
				if (botSymbol.equals("paper")) {
                                    System.out.println("The computer is " + botSymbol + ". You are " + playerSymbol + ". You lose" );
                                }
				break;
			case "paper":
				if (botSymbol.equals(playerSymbol)) {
                                    System.out.println("The computer is " + botSymbol + ". You are " + playerSymbol + " too. It is a draw");
                                }
				if (botSymbol.equals("rock")) {
                                    System.out.println("The computer is " + botSymbol + ". You are " + playerSymbol + ". You win" );
                                }
				if (botSymbol.equals("scissor")) {
                                    System.out.println("The computer is " + botSymbol + ". You are " + playerSymbol + ". You lose" );
                                }
				break;
		}
        
    }
    
    public static void ex3(){
        System.out.print("Enter year: (e.g., 2012): ");
	Scanner inputYear = new Scanner(System.in);
        int year = inputYear.nextInt();
        
        System.out.print("Enter month: 1-12: ");
	Scanner inputMonth = new Scanner(System.in);
        int month = inputMonth.nextInt();
        if (month == 1 || month == 2) {
            month += 12;
            year -= 1;
	}
        
        System.out.print("Enter the day of the month: 1-31: ");
	Scanner inputDay = new Scanner(System.in);
        int day = inputDay.nextInt();
        
        String days[] = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
	int h;
	int q = day;
	int m = month;
	int j = (int)Math.floor(year/100);
	int k = year%100;
		
	h = (q + (26*(m+1)/10) + k + k/4 + j/4 + 5*j)%7;
        
        System.out.println("Day of the week is " + days[h]);
    }

    public static void ex4(){
        int number;
        while(true) {
            System.out.print("Enter the number of lines: ");
            Scanner inputNumber = new Scanner(System.in);
            number = inputNumber.nextInt();
            if (number >= 1 && number <= 15) {
                break;
            }
        }
        
        int lineLength = number * 2 - 1;
		for (int i = 1; i <= number; ++i) {
                    for (int j = 0; j < Math.floor(lineLength/2); ++j) {
			if (number - i > j) System.out.print("\t");
			else System.out.print(number - j+" \t");
                    }
                    System.out.print("1\t");
                    for (int j = 0; j < Math.floor(lineLength/2); ++j) {
			if (j+2 > i) System.out.print(" \t");
			else System.out.print(j+2+ "\t");
                    }
                    System.out.print("\n");
		}
    }
}


