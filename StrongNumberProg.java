// Write a java program to Check Number Is Strong Number or Not.

import java.util.*;
public class StrongNumberProg
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the number:");
 int num=sc.nextInt();
 int temp=num;
 int sum=0;

  while(num>0){
	   int rem=num %10;
	   
	   int f=1;
	   int i=1;
	   while(i<=rem)
	   {
		   f=f*i;
		   i++;
	   }
	    System.out.println("fact is "+f);
	   
	   sum=sum+f;
	  num= num /10;
	  
  }
   System.out.println("sum is "+sum);
  
 if(sum==temp)
  {
  System.out.println("The number is strong");
  }
  else
  {
  System.out.println("the number is not strong");
  }
  
  }
}
 
