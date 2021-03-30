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
public abstract class Geometric {
    String color; 
    Boolean fill;
    Date dateCreated;

    public Geometric() {
        this.dateCreated = new Date();
    }
    
    public Geometric(String color,Boolean fill) {
        this.color = color;
        this.fill = fill;
        this.dateCreated = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public Boolean getFill() {
        return fill;
    }

    public void setFill(Boolean fill) {
        this.fill = fill;
    }
        
    public abstract double getArea();
    
    public abstract double getPerimetor();
    
    public abstract boolean equal();

    @Override
    public String toString() {
        return "Geometric{" + "color=" + color + ", fill=" + fill + ", dateCreated=" + dateCreated + '}';
    }
}
