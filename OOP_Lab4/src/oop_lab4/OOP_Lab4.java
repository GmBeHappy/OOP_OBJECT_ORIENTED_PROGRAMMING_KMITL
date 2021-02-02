/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_lab4;
import java.math.BigInteger;
import java.util.GregorianCalendar;
import java.util.Random;
import oop_lab4.Stock;


/**
 *
 * @author Gm
 */
public class OOP_Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

	//testStock();
	testGregorianCalendar();
    }

    // testing stock.
    public static void testStock() {
        Stock oracle = new Stock("ORCL", "Oracle Corporation");
	oracle.setPreviousClosingPrice(34.5);
	oracle.setCurrentPrice(34.35);

	System.out.println("Symbol: " + oracle.getSymbol());
	System.out.println("Name: " + oracle.getName());
	System.out.println("Previous Closing Price: " + oracle.getPreviousClosingPrice());
	System.out.println("Current Price: " + oracle.getCurrentPrice());
	System.out.println("Price Change: " + oracle.getChangePercent() + "%");
    }

	// testing gregorian calendar.
    public static void testGregorianCalendar() {
	GregorianCalendar calendar = new GregorianCalendar();

	printCalendar(calendar);

	System.out.println("-------------");

	long oneDayMillis = daysToMillis(1);
	calendar.setTimeInMillis((long) calendar.getTimeInMillis() + oneDayMillis);

	System.out.println("After specified the elapsed time of one day after current day");
	printCalendar(calendar);
	System.out.println(calendar.getTime());
    }

    private static void printCalendar(GregorianCalendar calendar) {
	System.out.printf("Year is %d\n", calendar.get(GregorianCalendar.YEAR));
	System.out.printf("Month is %d\n", calendar.get(GregorianCalendar.MONTH));
	System.out.printf("Date is %d\n", calendar.get(GregorianCalendar.DATE));
	System.out.printf("Day of week is %d\n", calendar.get(GregorianCalendar.DAY_OF_WEEK));
    }

    private static long daysToMillis(int days) {
	return (long) (days * 24 * 60 * 60 * 1000);
    }
}
