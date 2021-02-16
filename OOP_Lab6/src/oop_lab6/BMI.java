/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_Lab6;
import java.lang.IllegalArgumentException;
import java.lang.IllegalStateException;
/**
 *
 * @author Gm
 */
public class BMI {
    private String name;
    private int age;
    private double weight;
    private double feet;
    private double inches;

    public BMI() {
        this.name = "";
	this.age = 0;
	this.weight = 0.0;
	this.feet = 0.0;
	this.inches = 0.0;
    }
	
    public BMI(String name, int age, double weight, double feet, double inches) {
	if (name.trim().equalsIgnoreCase("") || !isAlphabets(name))
            throw new IllegalArgumentException("Invalid name");
	if (age <= 0 || age > Integer.MAX_VALUE)
            throw new IllegalArgumentException("Invalid age.");
	if (weight <= 0.0 || weight > Double.MAX_VALUE)
            throw new IllegalArgumentException("Invalid weight.");
	if (feet <= 0.0 || feet > Double.MAX_VALUE)
            throw new IllegalArgumentException("Invalid feet.");
	if (inches <= 0.0 || inches > Double.MAX_VALUE)
            throw new IllegalArgumentException("Invalid inches.");
	this.name = name;
	this.age = age;
	this.weight = weight;
	this.feet = feet;
	this.inches = inches;
    }
	
    private static boolean isAlphabets(String s) {
        return s != null && s.matches("^[a-zA-Z]*$");
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	if (name.trim().equalsIgnoreCase(""))
            throw new IllegalArgumentException("Invalid name.");
            this.name = name;
	}

    public int getAge() {
	return age;
    }

    public void setAge(int age) {
	if (age <= 0 || age > Integer.MAX_VALUE)
            throw new IllegalArgumentException("Invalid age.");
            this.age = age;
	}

    public double getWeight() {
	return weight;
    }

    public void setWeight(double weight) {
	if (weight <= 0.0 || weight > Double.MAX_VALUE)
            throw new IllegalArgumentException("Invalid weight.");
            this.weight = weight;
	}

    public double getFeet() {
	return feet;
    }

    public void setFeet(double feet) {
	if (feet <= 0.0 || feet > Double.MAX_VALUE)
            throw new IllegalArgumentException("Invalid feet.");
            this.feet = feet;
	}

    public double getInches() {
	return inches;
    }

    public void setInches(double inches) {
	if (inches <= 0.0 || inches > Double.MAX_VALUE)
            throw new IllegalArgumentException("Invalid inches.");
            this.inches = inches;
	}
	
    public double getBMI() {
	if (this.age == 0 ||
        this.name.equalsIgnoreCase("") ||
	this.feet == 0.0 ||
	this.inches == 0.0 ||
	this.weight == 0.0)	
            throw new IllegalStateException("Invalid state.");

            return this.calculateBMI(this.weight, this.feet, this.inches);
    }
	
    public String getInterpretation() {
	return this.interpretation(this.getBMI());
    }
	
    private double calculateBMI(double weight, double feet, double inches) {
	// 1 pound is 0.45359237
	// 1 inch is 0.0254 meters
	// 1 feet is 12 inches
		
	double weightInKilograms = weight * 0.45359237;
	double feetInMeters = feet * 12 * 0.0254;
	double inchesInMeters = inches * 0.0254;
		
	//System.out.println(weightInKilograms +" "+ feetInMeters+" "+ inchesInMeters);
		
	double totalHeightInMeters = feetInMeters + inchesInMeters;
		
	return weightInKilograms/(totalHeightInMeters*totalHeightInMeters);
    }
	
    private String interpretation(double BMI) {
	if (BMI < 18.5)
            return "Underweight";
	if (BMI < 25.0)
            return "Normal";
	if (BMI < 30.0)
            return "Overweight";
	if (BMI >= 30)
            return "Obese";
		
	return "Never reach";
    }
}
