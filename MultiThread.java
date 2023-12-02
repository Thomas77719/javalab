package javalab;
import java.util.Random;

class NumberManager{
	private int Numbergenerated;
	private boolean  GeneratedNumber=false;
	public synchronized void generateNumber() {
		
		Numbergenerated =new Random().nextInt(20)+2;
			System.out.println("The random generated number :"+ Numbergenerated);
			GeneratedNumber=true;
		    notifyAll();
	}

	//for even numbers 
	
	public synchronized void EvenNumbers() throws InterruptedException{
		while(! GeneratedNumber ||  Numbergenerated%2!=0) {
			wait();
		}
		 System.out.println("The square of the random number "+Numbergenerated*Numbergenerated+"");
			System.out.println();
			GeneratedNumber=false;
		}
	
	//For odd numbers
	
	public synchronized void OddNumbers() throws InterruptedException{
		while(! GeneratedNumber ||  Numbergenerated%2==0) {
			wait();
		}
		 System.out.println("The cube of the random number "+Numbergenerated*Numbergenerated*Numbergenerated+"");
			System.out.println();
			GeneratedNumber=false;
	}
}
class numberGenerator extends Thread{
	
	NumberManager numberManager;
	public numberGenerator (NumberManager numberManager) {
		this.numberManager= numberManager;
				
	}
    public void run() {
    	while(true) {
    		numberManager.generateNumber();	
        	try {
    			Thread.sleep(1000);
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		
    	}
    }
    }
    
}

class  PrintEvenThread extends Thread {
	NumberManager numberManager;
	public  PrintEvenThread(NumberManager numberManager) {
		this.numberManager=numberManager;
		
	}
	public void run() {
		while(true) {
			try {
				numberManager.EvenNumbers();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class  PrintOddThread extends Thread {
	NumberManager numberManager;
	public   PrintOddThread(NumberManager numberManager) {
		this.numberManager=numberManager;
		
	}
	public void run() {
		while(true) {
			try {
				numberManager.OddNumbers();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class MultiThread {
	public static void main(String [] args) {
		NumberManager numberManager=new NumberManager();
		numberGenerator numberGenerator = new numberGenerator(numberManager);
		PrintEvenThread  printeventhread=new  PrintEvenThread(numberManager);
		 PrintOddThread   printoddthread=new   PrintOddThread(numberManager);
		numberGenerator.start();
		printeventhread.start();
		printoddthread.start();
	}
}
