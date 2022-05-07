/**
 * 
 */
package com.gqt.Arrays;

import java.util.Scanner;

/**
 * @author Rahul
 * * description : This is a code for demonstration of 2 Dimensional jagged Array
 * @requirement To store marks of n students from m classrooms
 * class    : 0  1  2  3
 * Students : 1  2  3  4
 */
public class Array2D1 {

	/**
	 * @param args
	 * @param sc
	 * @param arr
	 * @param n
	 * @param m
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of classrooms : ");
		int m = sc.nextInt();
		int arr[][] = new int [m][];
		
		for (int i=0; i<arr.length; i++) {
			System.out.println("Enter the total number of students in classroom : " +(i+1));
			arr[i] = new int [sc.nextInt()];
		}
		System.out.println("Arrays is ready for the operation");
		System.out.println("The length of the outer portion of arrays is : " +arr.length);
		
		// The code to store the marks of n students inside m classrooms
		for (int i=0; i<arr.length; i++) {
			System.out.println("The count of students inside classroom - " +(i+1)+ " is " +arr[i].length);
			for (int j=0; j<arr[i].length; j++) {
				System.out.println("Enter the marks of student - " +(j+1));
				arr[i][j]=sc.nextInt();
			}
		}
		
		// The code to display the marks
		for (int i=0; i<arr.length; i++) {
			System.out.println("Inside Class - " +(i+1));
			for (int j=0; j<arr[i].length; j++) {
				System.out.println("The marks of student - " +(j+1)+" is : " +arr[i][j]);
			}
		}

	}

}
