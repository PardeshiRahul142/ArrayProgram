/*Q.5
Create a class BankAccount with accountNo, holderName, and balance.

Requirements:
Use createAccount() method to set data.

Methods for deposit(int amt), withdraw(int amt), and showBalance().*/

import java.util.*;
class BankAccount
{   Scanner sc=new Scanner(System.in);
    int acc_no;
	String holderName;
	int balance;
	int dep_amt;
	int total;
	int w_amt;
	int afterwithdrow;
   public void Create_acc()
   {
   
    System.out.println("Enter the Account number :");
	acc_no = sc.nextInt();
	sc.nextLine();
	System.out.println("Enter the holder Name :");
	holderName= sc.nextLine();
	
	System.out.println("Enter the balance :");
	balance = sc.nextInt();
	
	}
	
	public void deposite(int dep_amt)
	{
	System.out.println("Enter deposite amount :");
	dep_amt=sc.nextInt();
	 total = balance + dep_amt;
	}
	
	public void withdrow(int w_amt)
	{
	System.out.println("Enter the withdrow amount :");
	w_amt= sc.nextInt();
	 afterwithdrow=total - w_amt;
	}
	
	public void show()
	{
	System.out.println("total balance is :"+afterwithdrow);
	}
	
}
public class BankProject
{
  public static void main(String args[])
  {
   BankAccount bc = new BankAccount();
   int damt=0;
   int wamt=0;
   bc.Create_acc();
   bc.deposite(damt);
   bc.withdrow(wamt);
   bc.show();
   }
}