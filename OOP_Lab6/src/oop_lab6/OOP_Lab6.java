/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_lab6;
import OOP_Lab6.BMI;
import OOP_Lab6.Course;
import OOP_Lab6.Queue;
import java.util.InputMismatchException;
import java.lang.IllegalArgumentException;
import java.lang.IllegalStateException;
import java.util.Scanner;
/**
 *
 * @author Gm
 */
public class OOP_Lab6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //testBMI();
        //testCourse();
        //testQueue();
    }
    
    public static void testBMI(){
        Scanner inputName = new Scanner(System.in);
	Scanner inputAge = new Scanner(System.in);
	Scanner inputWeightInPounds = new Scanner(System.in);
	Scanner inputHeightInFeet = new Scanner(System.in);
	Scanner inputHeightInInches = new Scanner(System.in);
		
	String name;
	int age;
	double weight;
	double heightF;
	double heightI;
	BMI bmi;
		
	try {
            System.out.print("Enter name: ");
            name = inputName.nextLine().trim();

            System.out.print("Enter age: ");
            age = inputAge.nextInt();

            System.out.print("Enter weight in pounds: ");
            weight = inputWeightInPounds.nextDouble();

            System.out.print("Enter feet: ");
            heightF = inputHeightInInches.nextDouble();

            System.out.print("Enter inches: ");
            heightI = inputHeightInInches.nextDouble();


            bmi = new BMI(name, age, weight, heightF, heightI);

            System.out.printf("Name : %s\n", bmi.getName());
            System.out.printf("Age : %d\n", bmi.getAge());
            System.out.printf("Height : %.2f feets %.2f inches\n", bmi.getFeet(), bmi.getInches());
            System.out.printf("Weight : %.2f pounds\n", bmi.getWeight());
            System.out.printf("BMI : %.2f\n", bmi.getBMI());
            System.out.printf("Interprelation : %s\n", bmi.getInterpretation());
        }		
	catch(InputMismatchException | IllegalArgumentException | IllegalStateException error) {
            System.out.println(error);
	}
    }
    
    public static void testCourse(){
        int mode;
        int isRuning = 1;
        String name;
        Scanner inputMode = new Scanner(System.in);
        Scanner inputName = new Scanner(System.in);
        Course course = new Course("OOP");

        while(isRuning==1){
            try {
                System.out.println("1 : add");
                System.out.println("2 : drop");
                System.out.println("3 : clear");
                System.out.println("4 : exit");
   
                System.out.print("Enter mode: ");
                mode = inputMode.nextInt();
                
                if(mode==1){
                    System.out.print("[Add] Enter name: ");
                    name = inputName.nextLine();
                    course.addStudent(name);
                    System.out.println("Course : " + course.getCourseName());
                    displayStudents(course.getStudents(), course.getNumberOfStudents());
                }
                else if(mode ==2){
                    System.out.print("[Drop] Enter name: ");
                    name = inputName.nextLine();
                    course.dropStudent(name);
                    System.out.println("Course : " + course.getCourseName());
                    displayStudents(course.getStudents(), course.getNumberOfStudents());
                }
                else if(mode==3){
                    course.clearStudent();
                    System.out.println("Course : " + course.getCourseName());
                    displayStudents(course.getStudents(), course.getNumberOfStudents());
                }
                else if(mode==4){
                    isRuning=0;
                }

            }
            catch (IllegalArgumentException | IllegalStateException error) {
                System.out.println(error);
            }
        }
    }
   
    private static void displayStudents(String[] students, int numberOfStudents) {
        System.out.print("[Student] ");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print(students[i]+" ");
        }
        System.out.println("");
    }

    public static void testQueue(){
        Queue queue = new Queue();

        for (int i = 1; i <= 20; i++) {
            System.out.printf("Enqueue : %d\n", i);
            queue.enqueue(i);
            System.out.println("");
            for(int j = 0;j<queue.getSize();j++){
                System.out.print(queue.getElements()[j]+" ");
            }
            System.out.println("");
        }

        System.out.println("Empty : " + queue.empty());

        for (int i = 0; i < 21; i++) {
            System.out.printf("Dequeue : %d\n", queue.dequeue());
            System.out.println("");
            for(int j = 0;j<queue.getSize();j++){
                System.out.print(queue.getElements()[j]+" ");
            }
            System.out.println("");
        }

        System.out.println("Empty : " + queue.empty());
    }
}
