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
        //testEx2();
        testEx3();
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
    
    public static void testEx3() {
        System.out.println("Menu (1=Circle, 2=Rectangle, 3=Triangle, 4=Exit)");
        
        Scanner input = new Scanner(System.in);
        
        int mode;
        String color,color2;
        double r,r2,x1,y1,x2,y2,x3,y3,width,height;
        boolean filled = false ,filled2 = false;
        System.out.print("Your choice : ");
        mode = input.nextInt();
        switch(mode){
            case 1:
                System.out.print("Color : ");
                color = input.nextLine().trim();
                input.nextLine();
                System.out.print("Radius : ");
                r = input.nextDouble();
                if(color != null){
                    filled = true;
                }
                ComparableCircle c1 = new ComparableCircle(r,color,filled);
                
                System.out.print("Color : ");
                color2 = input.nextLine().trim();
                input.nextLine();
                System.out.print("Radius : ");
                r2 = input.nextDouble();
                if(color2 != null){
                    filled2 = true;
                }
                ComparableCircle c2 = new ComparableCircle(r2,color2,filled2);
                
                System.out.println("Circle 1 : "+c1.toString());
                System.out.println("Circle 2 : "+c2.toString());
                
                System.out.print("\nEqual Circles, if their radius are the same : ");
                System.out.println(c1.equals(c2));
                System.out.print("\nThe larger object using max method : ");
                switch (c1.compareTo(c2)) {
                    case 1 -> System.out.println("Circle 1 is larger than Circle 2");
                    case -1 -> System.out.println("Circle 2 is larger than Circle 1");
                    default -> System.out.println("They are EQUAL");
                }
                break;
            case 2:
                System.out.print("Color : ");
                color = input.nextLine();
                input.nextLine();
                if(color != null){
                    filled = true;
                }
                System.out.print("Width ,Height (respectively) :");
                width = input.nextDouble();
                height = input.nextDouble();
                ComparableRectangle rec1 = new ComparableRectangle(width,height,color,filled);
                
                //Rectangle 2
                System.out.print("Color : ");
                color2 = input.nextLine();
                input.nextLine();
                if(color2 != null){
                    filled2 = true;
                }
                System.out.print("Width ,Height (respectively) :");
                width = input.nextDouble();
                height = input.nextDouble();
                ComparableRectangle rec2 = new ComparableRectangle(width,height,color2,filled2);
                System.out.println("Rectangle 1 : "+rec1.toString());
                System.out.println("Rectangle 2 : "+rec2.toString());
                
                //compare
                System.out.print("\nEqual Rectangle, if their areas are the same : ");
                System.out.println(rec1.equals(rec2));
                System.out.print("\nThe larger object using max method : ");
                switch (rec1.compareTo(rec2)) {
                    case 1 -> System.out.println("Rectangle 1 is larger than Rectangle 2");
                    case -1 -> System.out.println("Rectangle 2 is larger than Rectangle 1");
                    default -> System.out.println("They are EQUAL");
                }
                break;
            case 3:
                System.out.print("Color : ");
                color = input.nextLine();
                input.nextLine();
                System.out.print("Side 1-3 (respectively) : ");
                x1 = input.nextDouble();
                y1 = input.nextDouble();
                x2 = input.nextDouble();
                y2 = input.nextDouble();
                x3 = input.nextDouble();
                y3 = input.nextDouble();
                if(color != null){
                    filled = true;
                }
                ComparableTriangle t1 = new ComparableTriangle(x1,y1,x2,y2,x3,y3,color,filled);
                
                //Triangel 2
                System.out.print("Color : ");
                color2 = input.nextLine();
                input.nextLine();
                System.out.print("Side 1-3 (respectively) : ");
                x1 = input.nextDouble();
                y1 = input.nextDouble();
                x2 = input.nextDouble();
                y2 = input.nextDouble();
                x3 = input.nextDouble();
                y3 = input.nextDouble();
                if(color2 != null){
                    filled2 = true;
                }
                ComparableTriangle t2 = new ComparableTriangle(x1,y1,x2,y2,x3,y3,color,filled);
                
                System.out.println("\nTriangel 1 : "+t1.toString());
                System.out.println("Triangel 2 : "+t2.toString());
                
                
                //Compare
                System.out.print("\nEqual Triangle, if their areas are the same : ");
                System.out.println(t1.equals(t2));
                System.out.print("\nThe larger object using max method : ");
                switch (t1.compareTo(t2)) {
                    case 1 -> System.out.println("Triangle 1 is larger than Triangle 2");
                    case -1 -> System.out.println("Triangle 2 is larger than Triangle 1");
                    default -> System.out.println("They are EQUAL");
                }
                break;        
                
        }
    }
}
