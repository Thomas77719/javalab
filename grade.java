/******************************************
 * File name   : grade
 * Discribtion : To print grade
 * Author      : Thomas varghese
 * Version     : 1.0
 *******************************************/
package lab;
import java.util.Scanner ;
public class grade {
	public static void main(String[] args) {
		int mark;
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the mark of the student :");      //getting mark of the student;
		mark = sc.nextInt() ;
		if(mark>=90) {
			System.out.println(" The Grade obtained by the student is : A+");
		}
		else if(mark>=80 && mark<90) {
			System.out.println(" The Grade obtained by the student is : A");
		}
		else if(mark>=70 && mark<80) {
			System.out.println(" The Grade obtained by the student is : B+");
		}
		else if(mark>=60 && mark<70) {
			System.out.println(" The Grade obtained by the student is : B");
		}
		else if(mark>=50 && mark<60) {
			System.out.println(" The Grade obtained by the student is : c+");
		}
		else if(mark>=40 && mark<50) {
			System.out.println(" The Grade obtained by the student is : c");
		}
		else 
		{
			System.out.println("The student has failed in the exam");
		}
	}
	
	
}
