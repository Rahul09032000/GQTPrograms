import java.util.Scanner;

public class InputBharathaMatha
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		System.out.print("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
         //Print B
        int n = sc.nextInt(); 
         for (int i = 0; i<n; i++) 
         {
            for (int j= 0;j<n; j++)
            {
                if (i==0||j==0||i==n/2||j==n-1||i==n-1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
             System.out.print("  ");  
              // Print H
            for (int j= 0;j<n; j++)
            {
                if (j==0||j==n-1||i==n/2)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }

            System.out.print("  ");
              //Print A
            for (int j= 0;j<n; j++){
                if (i==0 || j==0|| j==(n-1)||i==(n/2)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }

            System.out.print("  ");
             //Print R
            for (int j= 0;j<n; j++){
                if (j==0|| i==0 && j<=(n/2) ||i==(n/2) &&j<=(n/2) || j==(n/2) && i<=(n/2) ||
                		i-j==(n/2)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
           //    Print "A"
            System.out.print("  ");

            for (int j= 0;j<n; j++){
                if (i==0 || j==0|| j==(n-1)||i==(n/2)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
              //Print "T"
            System.out.print("  ");

            for (int j= 0;j<n; j++){
                if (i==0||j==n/2){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                
            }
            //Print "H"
            System.out.print("  ");

            for (int j= 0;j<n; j++){
                if (j==0||j==n-1||i==n/2){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
               //Print "A"
            System.out.print("  ");

            for (int j= 0;j<n; j++){
                if (i==0 || j==0|| j==(n-1)||i==(n/2)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
           
            
            // Print M
            System.out.print("          ");

            for (int j= 0;j<n; j++){
                if (j==0||j==n-1||((i+j==n-1)&&j>=n/2)||(i==j && j<=n/2)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }

            // Print "A"
            System.out.print("  ");

            for (int j= 0;j<n; j++){
                if (i==0 || j==0|| j==(n-1)||i==(n/2)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
                //Print "T"
            System.out.print("  ");

            for (int j= 0;j<n; j++){
                if (i==0||j==n/2){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
             //Print "H"
            System.out.print("  ");

            for (int j= 0;j<n; j++){
                if (j==0||j==n-1||i==n/2){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
               // Print "A"
            System.out.print("  ");

            for (int j= 0;j<n; j++){
                if (i==0 || j==0|| j==(n-1)||i==(n/2)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}
