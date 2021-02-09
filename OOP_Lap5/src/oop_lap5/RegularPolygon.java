/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_Lap5;
import java.lang.IllegalArgumentException;
/**
 *
 * @author Gm
 */
public class RegularPolygon {
	private int n = 3;
	private double side = 1f;
	private double x = 0f;
	private double y = 0f;
	
	public RegularPolygon() {};
	
	/**
	 *@param n the number of sides in the polygon.
	 *@param side the length of the side.
	 */
	public RegularPolygon(int n, double side) {
		this.n = n;
		this.side = side;
	}
	
	/**
	 *@param n the number of sides in the polygon.
	 *@param side the length of the side.
	 *@param x the x-coordinate of the polygon's center.
	 *@param y the y-coordinate of the polygon's center.
	 */
	public RegularPolygon(int n, double side, double x, double y) {
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}
	
	/**@return the number of sides in the polygon.*/
	public int getN() {
		return this.n;
	}
	
	/**
	 * Set the number of sides in the polygon.
	 * @param n the number of sides in the polygon.
	 */
	public void setN(int n) {
		if (n <= 2 | n > Integer.MAX_VALUE)
			throw new IllegalArgumentException("Invalid number of sides.");
		this.n = n;
	}
	
	/**@return the length of the side of the polygon.*/
	public double getSide() {
		return this.side;
	}
	
	/**
	 * Set the length of the side of the polygon.
	 * @param side the length of the side.
	 */
	public void setSide(double side) {
		if (side <= 0)
			throw new IllegalArgumentException("Length of sides neither be 0 or negative");
		this.side = side;
	}
	
	/**@return the x-coordinate of the polygon's center.*/
	public double getX() {
		return this.x;
	}
	
	/**
	 * Set the x-coordinate of the polygon's center.
	 * @param x the x-coordinate of the polygon's center.
	 */
	public void setX(double x) {
		this.x = x;
	}
	
	/**@return the y-coordinate of the polygon's center.*/
	public double getY() {
		return this.y;
	}
	
	/**
	 * Set the y-coordinate of the polygon's center.
	 * @param y the y-coordinate of the polygon's center.
	 */
	public void setY(double y) {
		this.y = y;
	}
	
	/**@return the perimeter of the polygon.*/
	public double getPerimeter() {
		return this.n * this.side;
	}
	
	/**@return the area of the polygon.*/
	public double getArea() {
		double area = (this.n * Math.pow(this.side, 2)/(4 * Math.tan(Math.PI/this.n)));
		return area;
	}
	
}
