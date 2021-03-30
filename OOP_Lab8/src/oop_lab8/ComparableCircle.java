package oop_lab8;


import oop_lab8.Circle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gm
 */
public class ComparableCircle extends Circle implements Comparable<Circle>{

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, Boolean fill) {
        super(radius, color, fill);
    }

    @Override
    public boolean equals(Object obj) {
        return ((Circle)obj).getRadius() == this.getRadius();
    }

    @Override
    public int compareTo(Circle o) {
        if(this.getArea()>o.getArea()){
            return 1;
        }
        else if (this.getArea()<o.getArea()){
            return -1;
        }
        else{
            return 0;
        }
    }
    
}
