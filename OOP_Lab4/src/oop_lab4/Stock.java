/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_lab4;
import java.lang.IllegalArgumentException;
import java.lang.IllegalStateException;
/**
 *
 * @author Gm
 */
public class Stock {
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	
	Stock(String symbol, String name) {
            this.symbol = symbol;
            this.name = name;
            this.previousClosingPrice = -1.0;
            this.currentPrice = -1.0;
	}
	
	public String getSymbol() {
            return this.symbol;
	}
	
	public String getName() {
            return this.name;
	}
        
        public void setSymbol(String newsymbol) {
            this.symbol = newsymbol;
	}
	
	public void setName(String newname) {
            this.name = newname;
	}
	
	public double getPreviousClosingPrice() {
            return this.previousClosingPrice;
	}
	
	public void setPreviousClosingPrice(double price) {
            this.previousClosingPrice = price;
	}
	
	public double getCurrentPrice() {
            return this.currentPrice;
	}
	
	public void setCurrentPrice(double price) {
            this.currentPrice = price;
	}
	
	public double getChangePercent() {
		
            double changedPercent = ((this.currentPrice - this.previousClosingPrice)/this.previousClosingPrice) * 100.0;
            return changedPercent;
	}
	
}
