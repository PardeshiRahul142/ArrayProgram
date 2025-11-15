//Write a java program to find the sum of all natural numbers between 1 to n.
import java.util.*;
public class NaturalNumSum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the n ");
int n=sc.nextInt();
int i=1;
int sum=0;
while(i<=n)
{
 sum=sum+i;
 i++;
 }
 System.out.print(sum);
 }
 }

 
