/* File        : MatrixMultiplication
 * Description : To find the product of 2 matrices
 * author      : Thomas varghese
 * version      : 1.0
 * Date        : 10/10/2023
 */

package lab;
import java.util.Scanner;
public class MatrixMultiplication{
	
	 public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("The deatils of the 1st matrix");
		System.out.println("Enter the rows and and columns of the 1st matrix: ");
	  int row1=obj.nextInt();
	  int column1=obj.nextInt();
	   System.out.println("The details of the 2nd matrix");
	   System.out.println("Enter the rows and columns of the 2nd matrix :");
	  int row2=obj.nextInt();
	  int column2=obj.nextInt();
	  int firstmatrix[][]=new int [row1][column1];
	  int secondmatrix[][]=new int [row2][column2];
	  int product[][]=new int[row1][column2];
	   System.out.println("Enter the elemets of the 1st matrix :");
	  for(int i=0;i<row1;i++)
	  {
		  for(int j=0;j<column1;j++)
		  {
			  firstmatrix[i][j]=obj.nextInt();
		  }
	  } 
	  System.out.println("The 1st matrix is :");
	  for(int i=0;i<row1;i++)
	  {
		  for(int j=0;j<column1;j++)
		  {
			  System.out.printf(firstmatrix[i][j]+"\t");
		  }
		  System.out.println("\n");
	  }
		  System.out.println("Enter the elements of the 2nd matrix");
	  for(int i=0;i<row2;i++)
	  {
		  for(int j=0;j<column2;j++)
		  {
			  secondmatrix[i][j]=obj.nextInt();
		  }
	  } 
	  System.out.println("The 2nd matrix is");
	  for(int i=0;i<row2;i++)
	  {
		  for(int j=0;j<column2;j++)
		  {
			  System.out.print(secondmatrix[i][j]+"\t");
		  }
		  System.out.println("\n");
	  }
	  
	  if(column1!=row2)
	  {
		  System.out.println("Multiplication is not possible");
		 
	  }
	  else
	  {
		  for(int i=0;i<row1;i++)
		  {
			  for(int j=0;j<column2;j++)
			  {
				  product[i][j]=0;
						  for(int k=0;k<column1;k++)
							  product[i][j]+=firstmatrix[i][k]*secondmatrix[k][i];
			  }
		  }
		  System.out.println("The product is :");
		  for (int i=0;i<row1;i++)
		  {
			  for(int j=0;j<column1;j++)
			  {
				  System.out.print(product[i][j]+"\t");
			  }
			  System.out.print("\n");
			  }
	  
	}
	  

	}
}