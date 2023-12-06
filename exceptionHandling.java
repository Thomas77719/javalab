package javalab;
import java.util.Scanner;

public class exceptionHandling {
public static void main(String[] args) {
	
	char choice='y';
   
   int number1,number2;
   Scanner sc=new Scanner(System.in);
   
   while(choice=='y') {
	   System.out.println("Program To Perform Divison");
       System.out.println("Enter the 1st Number -");
       number1 =sc.nextInt();
	   System.out.println("Enter the 2nd Number -");
	   number2 =sc.nextInt();
	
	try {
		int result;
		result=(number1/number2);
		System.out.println("Result="+result);

	}
	
		catch(ArithmeticException e) {
			System.out.println("/ by zero");
		}
		finally {
			System.out.println("End of Operation");
			System.out.println("Do you want to continue y or n");
			choice=sc.next().charAt(0);
		}
		}
}
}