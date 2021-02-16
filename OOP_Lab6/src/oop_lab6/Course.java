/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_Lab6;

/**
 *
 * @author Gm
 */
public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        if (!isAlphabets(courseName)) {
            throw new IllegalArgumentException("Invalid course name.");
        }
        this.courseName = courseName;
    }

    private static boolean isAlphabets(String s) {
        return s != null && s.matches("^[a-zA-Z ,.'-]+$");
    }

    public void addStudent(String student) {
        if (!isAlphabets(student)) {
            throw new IllegalArgumentException(student + " is student name.");
        }
        if (isDuplicate(student)) {
            throw new IllegalArgumentException(student + " is already in the course.");
        }
        if (this.numberOfStudents == this.students.length) {
            int currentSize = this.students.length;

            String[] newArray = new String[currentSize * 2];

            // copy elements in array.
            for (int i = 0; i < currentSize; ++i) {
                newArray[i] = this.students[i];
            }

            this.students = newArray;
        }

        this.students[numberOfStudents] = student;
        this.numberOfStudents++;
    }

    private boolean isDuplicate(String student) {
        for (int i = 0; i < this.numberOfStudents; i++) {
            if (this.students[i].equalsIgnoreCase(student)) {
                return true;
            }
        }

        return false;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {

        int foundIndex = -1;
        for (int i = 0; i < this.numberOfStudents; i++) {
            if (this.students[i].equalsIgnoreCase(student)) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            for (int i = foundIndex; i < this.numberOfStudents - 1; i++) {
                this.students[i] = this.students[i + 1];
            }

            this.numberOfStudents--;
        } else {
            throw new IllegalStateException("Can not drop. " + student + " is not in this course.");
        }
    }
    
    public void clearStudent(){
        for (int i = 0; i < this.numberOfStudents; i++) {
                this.students[i] = null;
        }
        this.numberOfStudents = 0;
    }
}
