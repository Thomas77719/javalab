package lab;
import java.util.Scanner;
public class primeOrNot {
public static void main(String[] args) {
	int number;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number to check whether it is  prime or not");
	number=sc.nextInt();
	if(isPrime(number)) {
		System.out.println("The number" + number + "is a prime number");}
		else{
			System.out.println("The number" + number + "is not a prime number");	
	     	}
     }	
static  boolean isPrime(int num)
{
    if(num<=1)
    {
        return false;
    }
   for(int i=2;i<=num/2;i++)
   {
           if((num%i)==0)
               return  false;
       }
       return true;
    }
}