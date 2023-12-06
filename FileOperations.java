package javalab;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations {
	public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Data");
	String str=sc.nextLine();
	FileReader input= null;
	FileWriter output= null;
	FileWriter output1=null;
	char [] array=new char[50];
	
	
	try{
		output=new FileWriter("inputfile.txt");
		output.write(str);
		output.flush();
		output.close();
		
		
		input = new FileReader("inputfile2.txt");
		int bytes=input.read(array);
		
		
		output1 = new FileWriter("outputfile2.txt");
	
		output1.write(array,0,bytes);
		output1.flush();
		output1.close();
		
	}catch(IOException e ) {
		e.printStackTrace();
	}
}
}




