import java.util.Scanner;

public class SampleInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter The Size");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++ ) {
			for(int j=0; j<n; j++) {
				if (i==0 || i==(n-1) || j==0 || j==(n-1) ||
						i==(n/2) || j==(n/2) || i==j || 
						i+j==(n-1) || i+j==(n/2) ||
						j-i==(n/2) || i-j==(n/2) || 
						i+j==((n-1)+(n/2))) {
					
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		
	}

}
