
public class Condition10 {
// *
// * *
// * @ *
// * @ @ *
// * * * * *
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0; i<5; i++) {
			for (int j=0; j<=i; j++) {
				if (i==4 || i==j || j==0 || i==0) {
					System.out.print("*");
					System.out.print(" ");
				}
				else {
					System.out.print("@");
					System.out.print(" ");
				}

			}
				System.out.println();
	}

   }
}