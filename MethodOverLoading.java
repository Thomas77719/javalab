/*********************************************
* file        : MethodOverLoading
* Author      : Thomas Varghese
* version     : 1.0
* description :  
* date        :  
**********************************************/

package javalab;
import java.util.Scanner;
public class MethodOverLoading {
	 
		public static void main(String [] args ) {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the choice:\n 1. Rectangle \n 2. Triangle \n 3. Circle");
	    	int choice;
	    	choice =sc.nextInt();
	    	Area area2=new Area();
	    	if(choice==1) {
	    	System.out.println("Enter the Length of rectangle:");
	    	int length =sc.nextInt();
	    	System.out.println("Enter the Breadth of rectangle:");
	    	int breadth =sc.nextInt();
	    	Area.area(length,breadth);
	    	}
	    	else if(choice==2) {
	    		System.out.println("Enter the Height of triangle  :");
	        	float height =sc.nextFloat();
	        	System.out.println("Enter the Base of triangle :");
	        	float base =sc.nextFloat();
	        	Area.area(height,base);
	    	}
	    	else if(choice==3) {
	    		System.out.println("Enter the Radius of circle :");
	        	float radius =sc.nextFloat();
	        	Area.area(radius);
	    	}
	    	else {
	    		System.out.println("wrong choice");
	    	}
	    		
	    	
	    	 
	       }
	    }
	    	class Area{
	    	  int length;
	    	  int breadth;
	    	  
	    	  public static void area(int length, int breadth) {
	    		  System.out.println("Area of Rectangle with width :" +length+" and breadth :"+breadth+" is:"+(length*breadth));
	    	  }
	    	  public static void area(float height, float base) {
	    		  System.out.println("Area of triangle with base:"+base+" and height:"+height+" is : "+(0.5*height*base));
	    	  }
	    	  public static void area(float radius) {
	    		  System.out.println("Area of circle with radius:"+radius+" is:"+2*(3.14*radius*radius));
	    	 }
	    	}

