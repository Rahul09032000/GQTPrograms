/**
 * 
 */
package com.gqt.Arrays;

import java.util.Scanner;

/**
 * @author Rahul
 * description : This is a code for demonstration of 3 Dimensional Array
 * @requirement To store marks of n students from m classrooms of o colleges
 * 
 * College		0	   1	  2
 * Classrooms 0	  1  0   1  0   1
 * Students	  2   2  2   2  2   2
 */
public class AssignmentArray {
	/**
	 * @param args
	 * @param sc
	 * @param arr
	 * @param n
	 * @param m
	 * @param o
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Count of Colleges : ");
		int m = sc.nextInt();
		System.out.println("Enter the Count of classrooms in each colleges : ");
		int n = sc.nextInt();
		System.out.println("Enter the Count of students in Each Classrooms of each College : ");
		int o = sc.nextInt();
		
		int arr [][][] = new int [m][n][o];
		
		// Code for collecting Marks
		System.out.println("Arrays is ready for the operation");
		System.out.println("The length of the outer portion on the array : "+arr.length);
		
		
		for (int i=0; i<arr.length; i++) { //---> College
			System.out.println("Inside the College : "+(i+1));
			for (int j=0; j<arr[i].length; j++) { // ---> Class
				System.out.println("Inside the Class : "+(j+1));
				for (int k=0; k<arr[j].length; k++) { //---> Students
					System.out.println("Enter the marks of student : "+(k+1));
				arr[i][j][k] = sc.nextInt();
				
			}
		}
	}
		for (int i=0; i<arr.length;i++) {
			System.out.println("Inside College - "+(i+1));
			for (int j=0; j<arr[i].length; j++) {
				System.out.println("Inside the Class : "+(j+1));
				for (int k=0; k<arr[i][j].length; k++) {
					System.out.println("The Student - "+(k+1)+"Marks is : "+arr[i][j][k]);
			}
			
		}

}
}
}