import java.util.Scanner;
public class Calculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner (System.in);
        
        int a ,b;
        char op;
        
        System.out.println("Enter the first number:");
		a =sc.nextInt();
		
		System.out.println("Enter the Second number:");
		b =sc.nextInt();
	
		System.out.println("Enter the operation");
		System.out.println("for addition +");
		System.out.println("for subtraction -");
		System.out.println("for multiplication *");
		System.out.println("for division / ");
		op = sc.next().charAt(0);
		
		if(op =='+')
		{
			System.out.println("The addition of two "+a+" and "+b+" is "+(a+b));
		}
		else if(op == '-')
		{
			System.out.println("The addition of two "+a+" and "+b+" is "+(a-b));
		}
		else if(op == '*')
		{
			System.out.println("The addition of two "+a+" and "+b+" is "+(a*b));
			
		}
		else if(op == '/')
		{
			System.out.println("The addition of two "+a+" and "+b+" is "+(a/b));
			
		}
	    else 
		{
		  System.out.println("Invalid input"); 	
		}
	}

}
