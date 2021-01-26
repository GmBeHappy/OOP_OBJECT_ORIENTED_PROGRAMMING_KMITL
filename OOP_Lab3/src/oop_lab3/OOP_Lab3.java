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
        //ex1();
        ex2();
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
        if (curNum == reversedNum)
            return true;
        else
            return false;
    }
    //**********************************************************************
    public static void ex2() {
		String[] strList1;
		String[] strList2;
		int[] intList1;
		int[] intList2;
		
		list1:
		while(true) {
			System.out.print("Enter list1 : ");
			Scanner inputList1 = new Scanner(System.in);
			try {
				strList1 = inputList1.nextLine().trim().split(" ");
				intList1 = processStrToInt(strList1);
				break;
			}
			catch (IllegalArgumentException error){	
				System.out.println(error);
				continue list1;
			}
		}
		
		Arrays.sort(intList1);
		
		list2:
		while(true) {
			System.out.print("Enter list2 : ");
			Scanner inputList2 = new Scanner(System.in);
			try {
				strList2 = inputList2.nextLine().trim().split(" ");
				intList2 = processStrToInt(strList2);
				break;
			}
			catch (IllegalArgumentException error){	
				System.out.println(error);
				continue list2;
			}
		}
		
		Arrays.sort(intList2);

		int[] mergedList = mergeSortedArrays(intList1, intList2);
		
		printArr(mergedList);
	}
	
	public static int[] processStrToInt(String[] strList) {
		int[] intList = new int[strList.length];
		int i = 0;
		for (String str: strList) {
			try {
				intList[i] = Integer.parseInt(str);
				i++;
			} catch (NumberFormatException e) {
				throw new IllegalArgumentException("Not a integer: '" + str + "' at index " + i + ", please try again.", e);
			}
		}
		return intList;
	}
	
	public static int[] mergeSortedArrays(int[] list1, int[] list2) {
		if (list1.length == 0) {
			return list2;
		} else if (list2.length == 0) {
			return list1;
		}
		
		int[] mergeArr = new int[list1.length + list2.length];
		
		int currentIndexFirst = 0;
		int currentIndexSecond = 0;
		int currentMergeIndex = 0;
		while (currentIndexFirst < list1.length && currentIndexSecond < list2.length) {
			if (list2[currentIndexSecond] > list1[currentIndexFirst]) {
				mergeArr[currentMergeIndex++] = list1[currentIndexFirst++];
			} else {
				mergeArr[currentMergeIndex++] = list2[currentIndexSecond++];
			}
		}
		while(currentIndexFirst < list1.length) {
			mergeArr[currentMergeIndex++] = list1[currentIndexFirst++];
		}
		while (currentIndexSecond < list2.length) {
			mergeArr[currentMergeIndex++] = list2[currentIndexSecond++];
		}
		
		return mergeArr;
	}
	
	private static void printArr(int[] list) {
		System.out.print("The merged list is ");
		for (int num: list) {
			System.out.print(num + " ");
		}
		System.out.print("\n");
	}
}
