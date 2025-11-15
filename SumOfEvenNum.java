//Q7. Write a java program to find the sum of all even numbers between 1 to n.
import java.util.*;
public class SumOfEvenNum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the n");
int n=sc.nextInt();
int i=1;
int sum=0;
while(i<=n)
{
  if(i%2==0)
  {
    sum =sum+i;
  }
  i++;
  }
  System.out.print(sum);
 }
}