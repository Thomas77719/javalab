/******************************************
 * File name   : Palindrome
 * Discribtion : To  check whether a string  is  palindrome or not
 * Author      : Thomas varghese
 * Version     : 1.0
 *******************************************/
package lab;
import java.util.Scanner ;

public class palindrome {
	public static void main(String [] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to check whether is it palindrome or not");
		String str = sc.next();
		boolean ispalindrome=check(str);
		if(ispalindrome==false){
			System.out.println(str +"is  palindrome");
		}
		else {
			System.out.println(str+"is not a palindrome");
		}
	}
		static boolean check(String str)
		{
			char [] charArray=str.toCharArray();
			int length=str.length();
			for(int i=0;i<=length/2;i++){
				if(charArray[i]!=charArray[length-i-1]) {
					return true;
				}
			}
			return false;
		}
}

	
