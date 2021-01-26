/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_lab3;
import java.util.*;
/**
 *
 * @author Gm
 */
public class OOP_Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // ex1();
        //ex2();
        ex3();
    }
    //**********************************************************************
    public static void ex1 (){
        int N = 0;
        int num = 2;
        while (N < 100){
            if (isPrimeNumber(num) && isPalindromicNumber(num)){
                System.out.print(num + "\t");
                N++;
                if ((N) % 10 == 0){
                    System.out.println();
                }
            }
            num++;
        }
    }
    public static boolean isPrimeNumber (int num){
        int N = 0;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                N++;
            }
            if (N > 1){
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindromicNumber (int num){
        int curNum = num;
        int reversedNum = 0;
        while (num > 0){
            reversedNum += num % 10;
            //System.out.println("reversedNum " + reversedNum);
            num = num / 10;
            //System.out.println("num " + reversedNum);
            if (num > 0){
                reversedNum *= 10;
            }
        }
        if(curNum == reversedNum){
            return true;
        }
        else{
            return false;
        }
    }
    //**********************************************************************
    public static void ex2() {
        int[] list1 = new int[5];
        int[] list2 = new int[4];
		
        for(int i=0;i<5;i++){
            list1[i] = (int)(Math.random()*100);
        }
        System.out.print("List 1 is ");
	for (int num: list1) {
            System.out.print(num + " ");
	}
        System.out.print("\n");
        
        for(int i=0;i<4;i++){
            list2[i] = (int)(Math.random()*100);
        }
        System.out.print("List 2 is ");
	for (int num: list2) {
            System.out.print(num + " ");
	}
        System.out.print("\n");  
        
	int[] mergedList = mergeSortedArrays(list1, list2);
		
	System.out.print("The merged list is ");
	for (int num: mergedList) {
            System.out.print(num + " ");
	}
	System.out.print("\n");
    }
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] merge = new int[n1 + n2];
            
        System.arraycopy(arr1, 0, merge, 0, n1);
        System.arraycopy(arr2, 0, merge, n1, n2);
        Arrays.sort(merge);
        return merge;
    }
    //**********************************************************************
    public static void ex3() {
	int size = 0;
        System.out.print("Enter the size for the matrix: ");
        Scanner inputSize = new Scanner(System.in);		
	size = inputSize.nextInt();

	int[][] matrix = randomMatrix(size);
	printMatrix(matrix);
        checkRowAllSame(matrix);
	checkColumnAllSame(matrix);
	checkSuperdiagonal(matrix);
	checkDiagonal(matrix);
	checkSubdiagonal(matrix);
    }
	
    private static int[][] randomMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = (int)Math.round(Math.random()); 
            }
	}
	return matrix;
    }
	
    private static void printMatrix(int[][] matrix) {
	int size = matrix.length;
	for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
		System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
	}
	System.out.print("\n");
    }
	
    private static void checkRowAllSame(int[][] matrix) {
	int size = matrix.length;
	boolean isSame = false;
	
        if (size == 1) {
            System.out.println("All " + matrix[0][0] + "s on row 0");
            return;
	}
		
	for (int row = 0; row < size; row++) {
            boolean isAllSame = true;
            for (int column = 0; column < size - 1; column++) {
		if (matrix[row][column] != matrix[row][column+1]) {
                    isAllSame = false;
                    break;
		}
            }
		if (isAllSame) {
                    if (!isSame) isSame = true;
			System.out.println("All " + matrix[row][0] + "s on row " + row);
		}
	}
	if (!isSame) {
            System.out.println("No same numbers on a row");
	}
    }
	
    private static void checkColumnAllSame(int[][] matrix) {
	int size = matrix.length;
	boolean isSame = false;
	if (size == 1) {
            System.out.println("All " + matrix[0][0] + "s on column 0");
            return;
	}
	for (int column = 0; column < size; column++) {
            boolean isAllSame = true;
                for (int row = 0; row < size - 1; row++) {
                    if (matrix[row][column] != matrix[row+1][column]) {
			isAllSame = false;
			break;
                    }
		}
			
		if (isAllSame) {
                    if (!isSame) isSame = true;
			System.out.println("All " + matrix[0][column] + "s on column " + column);
		}
	}
		
	if (!isSame) {
            System.out.println("No same numbers on a column");
	}
    }
	
    private static void checkSuperdiagonal(int[][] matrix) {
	int size = matrix.length;
	if (size == 1) {
            System.out.println("Rank one matrix doesn't have the superdiagonal");
            return;
	}
	if (size == 2) {
            System.out.println("All " + matrix[0][1] + "s on the superdiagonal");
            return;
	}
	for (int row = 0; row < size-2; row++) {
            if (matrix[row][row+1] != matrix[row+1][row+2]) {
		System.out.println("No same numbers on the superdiagonal");
		return;
            }	
	}
		
	System.out.println("All " + matrix[0][1] + "s on the superdiagonal");
		
    }
	
    private static void checkDiagonal(int[][] matrix) {
	int size = matrix.length;
	if (size == 1) {
            System.out.println("All " + matrix[0][0] + "s on the diagonal");
            return;
	}
	for (int i = 0; i < size-1; i++) {
            if (matrix[i][i] != matrix[i+1][i+1]) {
                System.out.println("No same numbers on the diagonal");
                return;
            }
	}
        System.out.println("All " + matrix[0][0] + "s on the diagonal");
    }
	
    private static void checkSubdiagonal(int[][] matrix) {
	int size = matrix.length;
	if (size == 1) {
            System.out.println("Rank one matrix doesn't have the subdiagonal");
            return;
	}
	if (size == 2) {
            System.out.println("All " + matrix[1][0] + "s on the subdiagonal");
            return;
	}
	for (int row = 1; row < size-1; row++) {
            if (matrix[row][row-1] != matrix[row+1][row]) {
		System.out.println("No same numbers on the subdiagonal");
		return;
            }	
	}
	System.out.println("All " + matrix[1][0] + "s on the subdiagonal");
    }	
}
