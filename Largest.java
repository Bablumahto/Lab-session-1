//Program to find largest of two numbers

import java.util.Scanner;
public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         int numA,numB, Largest;
         
         System.out.println("Enter the first number:");
         numA=sc.nextInt();
         
         System.out.println("Enter the Second number:");
         numB=sc.nextInt();
		
         if(numA>numB)
         {
        	 Largest = numA;
         }
         else {
        	 Largest = numB;       
        	 }
         
         System.out.println("Largest = " +Largest);
	}

}
