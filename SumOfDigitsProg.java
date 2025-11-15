//Q11. Write a java program to calculate the sum of digits of a number.
import java.util.*;
public class SumOfDigitsProg
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the number ");
 int num=sc.nextInt();
 int sum=0;
 for(int i=1;num !=0; i++)
 {
  int rem=num %10;
  sum=sum+rem;
  num /=10;
  }
  System.out.println("The sum of digit is "+sum);
  }
  }
  
 
