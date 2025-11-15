//Q8. Write a java program to find the sum of all odd numbers between 1 to n.
import java.util.*;
public class SumOfOddNum
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the n");
 int n=sc.nextInt();
 int sum=0;
 int i=1;
 while(i<=n)
 {
  if(i%2==1)
  {
  sum=sum+i;
  }
  i++;
  }
  System.out.print(sum);
  }
 }