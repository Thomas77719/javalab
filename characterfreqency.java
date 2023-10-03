/******************************************
 * File name   : Palindrome
 * Discription : To  check whether a string  is  palindrome or not
 * Author      : Thomas varghese
 * Version     : 1.0
 *******************************************/
package lab;
import java.util.Scanner ;
public class characterfreqency {
public static void main(String[] args){
	  String input;
      char checkCharacter;
      Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the string");
	  input=sc.nextLine();
	  System.out.println("Enter the character which the frequency to be checked");	
	  checkCharacter = sc.next().charAt(0);
	  int count=frequency(input,checkCharacter);
	  System.out.println("The number of occurance of the character in the string="+count );
		}
		
		static int frequency(String input,char checkCharacter){
			int count=0;
			char characterArray[]=input.toCharArray();
			for(int i=0;i<input.length();i++)
			{
				if(checkCharacter == characterArray[i])
				{
					count++;
				}
			}
			return count;
		}
	}
			


