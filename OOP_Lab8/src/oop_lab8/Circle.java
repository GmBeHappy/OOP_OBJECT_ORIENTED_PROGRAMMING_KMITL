package oop_lab8;


import oop_lab8.Geometric;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gm
 */
public class Circle extends Geometric{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, Boolean fill) {
        super(color, fill);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimetor() {
        return Math.PI*radius*2;
    }

    @Override
    public String toString() {
        return super.toString() + "Circle{" + "radius=" + radius + '}';
    }
    
}
