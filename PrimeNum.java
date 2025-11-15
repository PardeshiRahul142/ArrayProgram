//Write a java program to check Number Is Prime Number or Not
import java.util.*;
public class PrimeNum
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the number :");
  int n=sc.nextInt();
  boolean prime=true;
  if(n<=1)
  {
   prime=false;
   }
   else
   {
    for(int i=2;i<=n/2;i++)
	{
	 if(n % i ==0)
	 {
	 prime=false;
	 }
	 System.out.println("number= "+n+" i= "+i);
	}
   }
 if(prime)
 {
 System.out.println("The number is prime:");
 }
 else
 {
 System.out.println("The number is not prime");
 }
 }
}
