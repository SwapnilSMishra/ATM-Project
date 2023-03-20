package com.atm;
import java.util.*;
import java.text.*;
class Account 
{
	Scanner sc = new Scanner(System.in);
	
	DecimalFormat df=new DecimalFormat("'Rupee'###,##0.00");
	
	private int CN;
	private int PN;
	double CB=2000;
	double SB=1000;
	
	void setCustomerNo(int customerNo)
	{
		CN = customerNo;
	}
	
	void setPinNo(int pinNo) 
	{
		this.PN = pinNo;
	}
	
	 int getCustomerNo()
	 {
		return CN; 
	 }
	 
	 int getPinNo()
	 {
		 return PN;
	 }
	 double getCurrentBalance()
	 {
		return CB; 
	 }
	 double getSavingBalance()
	 {
		return SB; 
	 }
	   void getCurrentWithdrawInput()
	   {
		   System.out.println("Your Account Balanace:"+df.format(CB));
		   System.out.println("Amount you want to withdraw form Your Account");
		   
		   double amount=sc.nextDouble();
		   
		   if((CB-amount)>=0)
		   {
			   calcCurrentWithdrawInput(amount);
			   System.out.println("Tranction Successful\n your New Current Account Balance is:"+df.format(CB));
		   }
		   else
		   {
			   System.out.println("Insufficient balance");
		   }
	   }
	 void  calcCurrentWithdrawInput(double amount)
	   {
		   CB=CB-amount;
	   }
	 void getSavingWithdrawInput()
	   {
		   System.out.println("Your Account Balanace:"+df.format(SB));
		   System.out.println("Amount you want to withdraw form Your Account");
		   
		   double amount=sc.nextDouble();
		   
		   if((SB-amount)>=0)
		   {
			   calcSavingWithdrawInput(amount);
			   System.out.println("Tranction Successful\n your New Saving Account Balance is:"+df.format(SB));
		   }
		   else
		   {
			   System.out.println("Insufficient balance");
		   }
	   }
	 void  calcSavingWithdrawInput(double amount)
	   {
		   SB=SB-amount;
	   }
	 
	 void getCurrentDepositInput()
	   {
		   System.out.println("Your Account Balanace:"+df.format(CB));
		   System.out.println("Amount you want to Deposit in Your Account");
		   
		   double amount=sc.nextDouble();
		   
		   if((CB+amount)>=0)
		   {
			   calcCurrentDepositInput(amount);
			   System.out.println("Tranction Successful\n your New Saving Account Balance is:"+df.format(CB));
		   }
		   else
		   {
			   System.out.println("Insufficient balance");
		   }
	   }
	 void  calcCurrentDepositInput(double amount)
	   {
		   CB=CB+amount;
	   }
	 
	 void getSavingDepositInput()
	   {
		   System.out.println("Your Account Balanace:"+df.format(SB));
		   System.out.println("Amount you want to Deposit form Your Account");
		   
		   double amount=sc.nextDouble();
		   
		   if((SB+amount)>=0)
		   {
			   calcSavingDepositInput(amount);
			   System.out.println("Tranction Successful\n your New Saving Account Balance is:"+df.format(SB));
		   }
		   else
		   {
			   System.out.println("Insufficient balance");
		   }
	   }
	 void  calcSavingDepositInput(double amount)
	   {
		   SB=SB+amount;
	   }
	


}

class OptionMenu extends Account
{
	Scanner sc = new Scanner(System.in);
	HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
	DecimalFormat df=new DecimalFormat("'Rupee'###,##0.00");
	
	
   void getLogin()
   {
	   int x=1;
	   do
	   {
		   try
		   {
			   hm.put(1111, 111);
			   hm.put(1112, 112);
			   hm.put(1113, 113);
			   hm.put(1114, 114);
			   hm.put(1115, 115);
			   System.out.println("Welcome To The Atm");
			   System.out.println("Enter Account Number");
			   setCustomerNo( sc.nextInt()); //User Pass A number = 1111
			   System.out.println("Please Enter Pin Number");
			   setPinNo(sc.nextInt());//1111
			   int A = getCustomerNo();
			   int B = getPinNo();
			   
			   if(hm.containsKey(A)&& hm.get(A) == B)
			   {
				  
				   getAccountType();
			   }
			   else
			   {
				   System.out.println("Wrong Customer Number Or Pin Number"); 
				   System.out.println("Please Enter The Valid Customer Number Or Pin Number"); 
			   }
		   }
			   
			   catch(InputMismatchException a)
		    	{
			   		System.out.println("Please Enter Only Numbers");
			   		x=2;
			    }
	   }while(x==1);
	   
	   }
	   		
	   		void getAccountType()
	 	       {
	 		   System.out.println("Select The Account Type"); 
	 		   System.out.println("Type 1: Current Account"); 
	 		   System.out.println("Type 2: Saving Account"); 
	 		   System.out.println("Type 3 : Exit "); 
	 		   System.out.println("Choice :");
	 		   
	 		   int choice = sc.nextInt();
	 		   
	 		   switch(choice)
	 		       {
	 		       case 1: 
	 		    	   getCurrent();
	 		    	   break;
	 		       case 2: 
	 		    	   getSaving();
	 		    	   break;
	 		       case 3: 
	 		    	   System.out.println("Thank You For Visiting\n VISIT AGAIN");
	 		    	   break;
	 		       default:
	 		    	  System.out.println("Invalid Choice.\n Please Enter The Valid Choice");
	 		    	  break;
	 		        }
	 		   }
void getCurrent()
 {
	System.out.println("Current Account");
	System.out.println("Type 1:View Balanace");
	System.out.println("Type 2:Withdraw Money");
	System.out.println("Type 3:Deposite Money");
	System.out.println("Type 4:Exit");
	System.out.println("Choice: ");
	int choice=sc.nextInt();
	switch(choice)
	{
	   case 1:
		   System.out.println("Your Current Account Balance: "+df.format(getCurrentBalance()));
		   break;
	   case 2:
		   getCurrentWithdrawInput();
		   getAccountType();
		   break;
	   case 3:
		   getCurrentDepositInput();
		   getAccountType();
		   break;
		   
	   case 4:
		   System.out.println("Thank You For Visiting\n VISIT AGAIN");
		   break;
	   default:
		   System.out.println("Invalid Choice.\n Please Enter The Valid Choice");
		   break;
	}
 }
void getSaving()
 {
	System.out.println("Saving Account");
	System.out.println("Type 1:View Balanace");
	System.out.println("Type 2:Withdraw Money");
	System.out.println("Type 3:Deposite Money");
	System.out.println("Type 4:Exit");
	System.out.println("Choice: ");
	int choice=sc.nextInt();
	switch(choice)
	{
	   case 1:
		   System.out.println("Your Saving Account Balance: "+df.format(getSavingBalance()));
		   break;
	   case 2:
		   getSavingWithdrawInput();
		   getAccountType();
		   break;
		   
	   case 3:
		   getSavingDepositInput();
		   getAccountType();
		   break;
		   
	   case 4:
		   System.out.println("Thank You For Visiting\n VISIT AGAIN");
		   break;
	   default:
		   System.out.println("Invalid Choice.\n Please Enter The Valid Choice");
		   break;
	}
 }
public static class ATM2212 extends OptionMenu
{

	public static void main(String[] args)
	{
		OptionMenu op = new OptionMenu();
		op.getLogin();
	}
}
}




