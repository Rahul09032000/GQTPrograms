import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.next();
		String s2="";
		for (int i=s1.length()-1;i>=0;i--) {
			s2 = s2+s1.charAt(i);
		}
		System.out.println(s2);
		if (s1.equals(s2)==true) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}

	}

}
