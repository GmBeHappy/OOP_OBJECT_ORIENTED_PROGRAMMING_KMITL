/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_lab8;

/**
 *
 * @author Gm
 */
public class ComparableRectangle extends Rectangles implements Comparable<Rectangles>{

    public ComparableRectangle(double width, double height) {
        super(width, height);
    }

    public ComparableRectangle(double width, double height, String color, Boolean fill) {
        super(width, height, color, fill);
    }

    @Override
    public boolean equals(Object obj) {
        return ((Rectangles)obj).getArea() == this.getArea(); 
    }

    @Override
    public int compareTo(Rectangles o) {
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
