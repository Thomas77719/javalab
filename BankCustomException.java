package javalab;

import java.util.Scanner;

class InvalidAmountException extends Exception{
	InvalidAmountException(String str){
		super(str);
	}
}

class InsufficientAmountException extends Exception{
	InsufficientAmountException(String str){
		super(str);
	}
}

class Customer{
	Scanner sc= new Scanner(System.in);
	int accountNumber,balance;
	String accountType,customerName;
	public void setCustomerDetails() {
		System.out.println("Enter Account Number");
		accountNumber=sc.nextInt();
		System.out.println("Enter Account Type");
		accountType=sc.next();
		System.out.println("Enter Name");
		customerName =sc.next();
		System.out.println("Enter Balance ");
		balance=sc.nextInt();
	}
	public void getCustomerDetails() {
		System.out.println("---------------");
		System.out.println("Customer Details are : ");
		System.out.println("Account Number : "+this.accountNumber);
		System.out.println("Account Type : "+this.accountType);
		System.out.println("Customer Name : "+this.customerName);
		System.out.println("Account Balance : "+this.balance);
	}
	
}


public class BankCustomException {
	public static void main(String[] args) {
	InvalidAmountException amountException= new InvalidAmountException("Invalid Amount; amount<0");
	InsufficientAmountException fundsException= new InsufficientAmountException("Insufficient Balance ");
		Scanner sc= new Scanner(System.in);
		
	
		
		int lim,choice;
		System.out.println("How many number of customers do you want to input?");
		lim=sc.nextInt();
		Customer[]  customer =new Customer[lim];
		
		for(int i=0;i<lim;i++) {
			customer[i]= new Customer();
			customer[i].setCustomerDetails();
		}
		
		 do{
		System.out.printf("***Banking System Application  *** \n"
				+ "1. Display all account details \n "
				+ "2. Search by Account Number \n "
				+ "3. Deposit the Amount \n "
				+ "4. Withdraw the Amount \n "
				+ "5. Exit \n"
				+ "Enter Your Choice \n");
		choice=sc.nextInt();
		switch (choice) {
		
		//Displaying Details
		case 1 : 
		for(int i=0;i<lim;i++) {
			customer[i].getCustomerDetails();
		}
		break;
		
		//Searching By Account Number
		case 2 : 
			int accNo;
			System.out.println("Enter Account Number you want to search : ");
			accNo=sc.nextInt();
			int j=0;
			for(int i=0;i<lim;i++) {
				if(customer[i].accountNumber==accNo) {
					customer[i].getCustomerDetails();
					j++;
				}
			}
			if(j==0) {
				System.out.println("Account not found");
			}
			break;
			
		//Depositing Money
		case 3 :
			int depositAmount;
			System.out.println("Enter Account Number : ");
			accNo=sc.nextInt();
			try {
			System.out.println("Enter The Amount you want to deposit ");
			depositAmount=sc.nextInt();
			if(depositAmount<=0) {
				throw amountException;
			}
			else
			{
				 j=0;
			for(int i=0;i<lim;i++) {
				if(customer[i].accountNumber==accNo) {
					customer[i].balance=customer[i].balance+depositAmount;
					j++;
					}
				
				}
			if(j==0) {
				System.out.println("Account not found");
			}
			}
			}
			catch(InvalidAmountException e) {
				System.out.println(e.getMessage());
			}
			
			
			break;
			
			
		//Withdrawing Money	
		case 4 :
			int withdrawAmount;
			System.out.println("Enter Account Number : ");
			accNo=sc.nextInt();
			try {
			
			System.out.println("Enter Amount to Withdraw ");
			withdrawAmount=sc.nextInt();
			if(withdrawAmount<=0) {
				throw amountException;
			}
			else {
				 j=0;
			for(int i=0;i<lim;i++) {
				if(customer[i].accountNumber==accNo) {
					if(withdrawAmount>customer[i].balance) {
						throw fundsException;
			        } 
                    else{
					customer[i].balance = customer[i].balance - withdrawAmount;
                  			  j++;
                    }
			    }
			   
			}
			if(j==0) {
				System.out.println("Account not found");
			}
			}
			}catch(InvalidAmountException e) {
				System.out.println(e.getMessage());
			}
			catch (InsufficientAmountException e) {
                        System.out.println(e.getMessage());
            }
                    break;
                default:
                    // Invalid choice
            }
        } while (choice < 5);
	}
}



