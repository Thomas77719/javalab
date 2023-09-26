package lab;
import java.util.Scanner ;
public class attendancemarks {
	public static void main(String[] args){
		int attendence ;
		float mark=10f;
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the attendance percentage of the student :");
		attendence = sc.nextInt() ;
		if (attendence>=90 ) {
			System.out.println("The grade of the student is: " +mark);
		}
		else {
			mark = (float)attendence/10;
			System.out.println("Mark obtained by the student is :" +mark);
		}
	}
	

}
