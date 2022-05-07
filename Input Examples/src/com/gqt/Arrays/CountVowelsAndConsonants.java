package com.gqt.Arrays;

import java.util.Scanner;

public class CountVowelsAndConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		int vowel_count=0;
		int cons_count=0;
		
		for (int i=0; i<s1.length(); i++) {
			char c = s1.charAt(i);
			if ( c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				vowel_count++;
			}
			else {
				cons_count++;
			}
		}
		System.out.println("Length of the String is : "+s1.length());
		System.out.println("Totalnumber of vowels are : "+vowel_count);
		System.out.println();

	}

}
