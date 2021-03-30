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
public class ComparableTriangle extends Triangle implements Comparable<Triangle>{

    public ComparableTriangle(double x1, double x2, double x3, double y1, double y2, double y3) {
        super(x1, x2, x3, y1, y2, y3);
    }

    public ComparableTriangle(double x1, double x2, double x3, double y1, double y2, double y3, String color, Boolean fill) {
        super(x1, x2, x3, y1, y2, y3, color, fill);
    }

    @Override
    public boolean equals(Object obj) {
        return ((Triangle)obj).getArea() == this.getArea(); 
    }

    @Override
    public int compareTo(Triangle o) {
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
