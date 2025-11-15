//Write a java program to check whether a number is palindrome or not. 
import java.util.*;
public class Palindrome
{
  public static void main(String args[])
  { 
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter the number :");
   int num =sc.nextInt();
   int rem,res=0;
   int temp=num;
   
   while(num !=0)
   {
    rem = num % 10;
	num = num / 10;
	res=res *10 + rem;
	}
	if(temp == res)
	{
	System.out.print("The number is palindrome:");
	}
    else
	{
	 System.out.print("The number is not palindrom");
	}
  }
}
  