package javalab;
import java.util.Scanner;


 
class MultiplicationTable{
	synchronized void printMultiplicationTable(int number) {
		
		System.out.println("The Multiplication Table Of The Given Thread  ," + number );
		  for(int i=1;i<=10;i++) {
			 System.out.println(i+"X"+ number +"=" + i*number);
		 }
  }
}


class MyThread1 extends Thread{
	MultiplicationTable t ;
	int number;
	MyThread1(MultiplicationTable t,int number){
		this.t=t;
		this.number=number;
	}
	public void run() {
		t.printMultiplicationTable(number);
	}
}


class MyThread2 extends Thread{
	MultiplicationTable t ;
	int number;
	MyThread2(MultiplicationTable t,int number){
		this.t=t;
		this.number=number;
	}
	public void run() {
		t.printMultiplicationTable(number);
	}
}

class MyThread3 extends Thread{
	MultiplicationTable t ;
	int number;
	MyThread3(MultiplicationTable t,int number){
		this.t=t;
		this.number=number;
	}
	public void run() {
		t.printMultiplicationTable(number);
	}
}


public class ThreadSynchronization{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1,num2,num3;
		MultiplicationTable m= new MultiplicationTable();
		
		System.out.println("Enter the Table you want to run by thread 1 : ");
		num1=sc.nextInt();
		MyThread1 t= new MyThread1(m,num1);
		
		System.out.println("Enter the Table you want to run by thread 2 : ");
		num2=sc.nextInt();
		MyThread2 t2 =new MyThread2(m,num2);
		
		System.out.println("Enter the Table you want to run by thread 3 : ");
		num3=sc.nextInt();
		MyThread3 t3 =new MyThread3(m,num3);
		
		
		t.start();
		t2.start();
		t3.start();
		
	}

}