/**
 * 
 */
package com.gqt.Arrays;

import java.util.Scanner;

/**
 * @author Rahul
 * description : This is a code for demonstration of 1 Dimensional Array
 * @requirement To store marks of n students 
 */
public class Array1D {

	/**
	 * @param args
	 * @param sc
	 * @param arr
	 * @param n
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students");
		int n = sc.nextInt();
		
		int arr[] = new int [n];
		System.out.println("Arrays is ready for the operation");
		System.out.println("The length of the given array is:" +arr.length);
		
		// The code to collect and store the marks of n students.
		for (int i=0; i<arr.length; i++) {
			System.out.println("Enter the marks of student -"+(i+1));
			arr[i]=sc.nextInt();
		}
		
		// The code to display the marks of n students.
		for (int i=0; i<arr.length; i++) {
			System.out.println("The marks of Student -" +(i+1)+ " is : "+arr[i]);
		}

	}

}
