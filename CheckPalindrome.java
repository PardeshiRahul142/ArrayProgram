//Q14. Write a java program to check whether a number is palindrome or not.
import java.util.*;
public class CheckPalindrome
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the number :");
  int num=sc.nextInt();
  int temp=num;
  int rev=0;
  for(int i=1; num !=0;i++)
  {
   int rem = num%10;
   rev=rev*10+rem;
   num=num/10;
   }
   if(rev == temp)
     {System.out.println("the number is palindrome");
     }
	else
	  {System.out.println("The number is not palindrome");
	  }
	  
	 }
	 }