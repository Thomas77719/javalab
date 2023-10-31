package lab;
import java.util.Scanner;

public class transposeOfaMatrix {
public static void main(String[] args){
	int row;
	int column;
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter The Rows And Columns Of The Array :");
	 row = sc.nextInt();
	 column=sc.nextInt();
	 int Array[][]=new int[row][column];
	 System.out.println("Enter the elements of the arrray ");
	 for(int i=0;i<row;i++) {
		 for(int j=0;j<column;j++) {
			 Array[i][j]=sc.nextInt();
					 
		 }
	 }
	 for(int i=0;i<row;i++) {
		 for(int j=0;j<column;j++) {
			 System.out.print(Array[i][j]+ " ");
			 
		 }
		 System.out.println("");
	 }
	 System.out.println("The Transpose of a matrix :");
	 for(int i=0;i<column;i++) {
		 for(int j=0;j<row;j++) {
            System.out.print(Array[j][i]+ " ");	 
		 }
		 System.out.println("");
		 }
}
}
