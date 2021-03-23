/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_lab8;

import java.util.Date;

/**
 *
 * @author Gm
 */
public class Triangle extends Geometric{
    double x1,x2,x3,y1,y2,y3,side1,side2,side3;

    public Triangle(double x1, double x2, double x3, double y1, double y2, double y3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        side1 = Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
        side2 = Math.sqrt(Math.pow(x2-x3, 2)+Math.pow(y2-y3, 2));
        side3 = Math.sqrt(Math.pow(x1-x3, 2)+Math.pow(y1-y3, 2));
    }

    public Triangle(double x1, double x2, double x3, double y1, double y2, double y3, String color, Boolean fill) {
        super(color,fill);
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        side1 = Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
        side2 = Math.sqrt(Math.pow(x2-x3, 2)+Math.pow(y2-y3, 2));
        side3 = Math.sqrt(Math.pow(x1-x3, 2)+Math.pow(y1-y3, 2));
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    
    @Override
    public double getArea() {
        if((x1==y1)&&(x2==y2)&&(x3==y3)){
            System.out.println("Cannot calculate Area");
            return 0;
        }
        else{
            double s = (side1 + side2 + side3) / 2;
            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        }
    }

    @Override
    public double getPerimetor() {
        return side1+side2+side3;
    }

    @Override
    public String toString() {
        return super.toString() + "Triangle{" + "x1=" + x1 + ", x2=" + x2 + ", x3=" + x3 + ", y1=" + y1 + ", y2=" + y2 + ", y3=" + y3 + ", side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + '}';
    }
    
}
