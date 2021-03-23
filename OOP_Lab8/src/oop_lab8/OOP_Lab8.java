/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_lab8;
import java.util.Scanner;
import java.util.ArrayList;

public class OOP_Lab8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //testEx1();
        testEx2();
    }
    
    public static void testEx1(){
        Scanner input = new Scanner(System.in);  
        System.out.print("X1:");
        double x1 = input.nextDouble();
        System.out.print("Y1:");
        double y1 = input.nextDouble();
        System.out.print("X2:");
	double x2 = input.nextDouble();
        System.out.print("Y2:");
        double y2 = input.nextDouble();
        System.out.print("X3:");
	double x3 = input.nextDouble();
        System.out.print("Y3:");
        double y3 = input.nextDouble();
	System.out.print("Enter a color: ");
	String color = input.next();
	System.out.print("Is the triangle filled (true / false)? ");
	boolean filled = input.nextBoolean();
        System.out.println("--------------------------------------------");
	Triangle triangle = new Triangle(x1,x2,x3,y1,y2,y3,color,filled);
        System.out.println("Area : " + triangle.getArea());
        System.out.println("Color: " + triangle.getColor());        
        System.out.println("Perimetor : " + triangle.getPerimetor());            
        System.out.println("Filled : " + triangle.getFill());        
    }
    
    public static void testEx2(){
        Geometric[] geometries = new Geometric[5];
        geometries[0] = new Circle(5, "red", true);
        geometries[1] = new Circle(5, "red", true);
        geometries[2] = new Rectangles(5, 10, "Yellow", true);
        geometries[3] = new Rectangles(15, 20, "Yellow", true);
        geometries[4] = new Triangle(0, 0, 0, 4, 4, 0, "White", false);

        System.out.printf("Total sum of area is %.2f", sumArea(geometries));
        System.out.println("");
    }
    
    public static double sumArea(Geometric[] geometries) {
        double sum = 0.0;
        for (Geometric geom : geometries) {
            if(geom instanceof Circle){
                System.out.println("Radius : " + ((Circle)geom).getRadius() + " Area : " + ((Circle)geom).getArea());
            }
            else if(geom instanceof Rectangles){
                System.out.println("height : " + ((Rectangles)geom).getHeight() + " width : " + ((Rectangles)geom).getWidth() + " Area : " + ((Rectangles)geom).getArea());
            }
            else if(geom instanceof Triangle){
                System.out.println("Side1 : " + ((Triangle)geom).getSide1() + " Side2 : " + ((Triangle)geom).getSide2() + " Side3 : " + ((Triangle)geom).getSide3() + " Area : " + ((Triangle)geom).getArea());
            }
          sum += geom.getArea();
        }
        return sum;
    }
    
}
