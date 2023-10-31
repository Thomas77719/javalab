package lab;

import java.util.Scanner;

public class secondLargest {
	public static void main(String[] args){
		int limit;
		int temp;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Size of the Array");
		limit=sc.nextInt();
		 int Array[]=new int[limit];
		 System.out.println("Enter the elements of the arrray ");
		 for(int i=0;i<limit;i++) {
				 Array[i]=sc.nextInt();
						 
}
		 for(int i=0;i<limit;i++) {
			 System.out.println(Array[i]);
		 }
	 for(int i=0;i<limit;i++) {
		 for(int k=i+1;k<limit;k++) {
			 if(Array[i]>Array[k]) {
				 temp=Array[i];
				 Array[i]=Array[k];
				 Array[k]=temp;
						 
			 }
		 }
	 }
	 System.out.println("The Second largest is " + Array[1]);
}}