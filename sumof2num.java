package lab;
import java.util.Scanner ;

public class sumof2num {
	public static void main(String[] args)
	{
		int numberOne , numberTwo , sum=0;
		Scanner sc = new Scanner(System.in) ; 
		System.out.println("Enter 2 numbers:");
			numberOne = sc.nextInt() ;
					numberTwo = sc.nextInt();
					sum = numberOne+numberTwo ;
					System.out.println("Sum of the two numbers is  :"+ sum);
		}
	}

