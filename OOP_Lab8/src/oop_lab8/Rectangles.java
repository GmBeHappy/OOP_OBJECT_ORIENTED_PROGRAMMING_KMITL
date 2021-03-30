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
public class Rectangles extends Geometric{
    double width,height;

    public Rectangles(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangles(double width, double height, String color, Boolean fill) {
        super(color, fill);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    @Override
    public double getArea() {
        return height*width;
    }

    @Override
    public double getPerimetor() {
        return 2*height*width;
    }

    @Override
    public String toString() {
        return super.toString() + "Rectangles{" + "width=" + width + ", height=" + height + '}';
    }

    @Override
    public boolean equal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
