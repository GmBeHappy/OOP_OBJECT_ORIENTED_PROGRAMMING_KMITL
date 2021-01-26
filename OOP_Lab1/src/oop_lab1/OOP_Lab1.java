/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_lab1;

import java.util.Scanner;
/**
 *
 * @author Gm
 */
public class OOP_Lab1 {
    
    public static void main(String[] args) {
        //ex1();
        //ex2();
        //ex3();
        ex4();
    }
    public static void ex1(){
        long population = 312032486;
        long allSecond = 31536000*5;
        long newBirth = (long) (allSecond / 7);
        long death = (long) (allSecond / 13);
        long newImmigrant = (long) (allSecond / 45);
        long currentPop = ((population + newBirth) - death) + newImmigrant;
        
        System.out.println("current pop is " + population + " birth is " + newBirth + " death is " + death + " new immi is " + newImmigrant+ " all population is " + currentPop);
        //System.out.println(currentPop);
    }
    
    public static void ex2(){
        System.out.print("Enter a : ");
        Scanner inputA = new Scanner(System.in);
        double a = inputA.nextDouble();
        
        System.out.print("Enter b : ");
        Scanner inputB = new Scanner(System.in);
        double b = inputB.nextDouble();
        
        System.out.print("Enter e : ");
        Scanner inputE = new Scanner(System.in);
        double e = inputE.nextDouble();
        
        System.out.print("Enter c : ");
        Scanner inputC = new Scanner(System.in);
        double c = inputC.nextDouble();
        
        System.out.print("Enter d : ");
        Scanner inputD = new Scanner(System.in);
        double d = inputD.nextDouble();
        
        System.out.print("Enter f : ");
        Scanner inputF = new Scanner(System.in);
        double f = inputF.nextDouble();
        
        //double a = 3.4d , b = 50.2d , e = 44.5d , c = 2.1d , d = 0.55d , f = 5.9d;
        double x = ((e*d)-(b*f))/((a*d)-(b*c));
        double y = ((a*f)-(e*c))/((a*d)-(b*c));
        System.out.println("x : " + x);
        System.out.println("y : " + y);
    }
    
    public static void ex3(){
        System.out.print("Enter number between 0-1000 : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num<=1000){
            int firstDigit = num % 10;
            int seccondDigit = (num / 10) % 10;
            int thirdDigit = (num / 100) % 10;
            int fourThDigit = (num  / 1000);
            //System.out.println(firstDigit + " " + seccondDigit + " " + thirdDigit + " " + fourThDigit);
            int sum = firstDigit + seccondDigit + thirdDigit + fourThDigit;
            System.out.println("sum : " + sum);
        }
        else{
            System.out.println("Failed");
        }
    }
    
    public static void ex4(){
        System.out.print("Enter weight in pounds : ");
        Scanner input = new Scanner(System.in);
        double weight = input.nextDouble();
        
        System.out.print("Enter height in inches: : ");
        Scanner input2 = new Scanner(System.in);
        double height = input2.nextDouble();
        
        if(weight > 0 && height > 0){
            double weightKG = weight * 0.45359237;
            double heightM = height * 0.0254;

            double BMI = weightKG/(heightM*heightM);
            System.out.println("BMI is " + BMI);
        }
        else{
            System.out.println("Failed");
        }
    }
    
}
