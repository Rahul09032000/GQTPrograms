package com.gqt.Arrays;

import java.util.Scanner;

public class InterchageLetterCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		char[] chr=s1.toCharArray();
		for (int i=0; i<chr.length;i++) {
			if (chr[i]>=65 && chr[i]<=90) {
				chr[i]=(char) (chr[i]+32);
			}
			else if(chr[i]>=97 && chr[i]<=122) {
				chr[i]=(char)(chr[i]-32);
			}
		}
		for (int i=0;i<chr.length;i++) {
			System.out.print(chr[i]);
		}
	}

}
