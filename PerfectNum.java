//Q22. Write a java program to Check Number Is Perfect Number or Not.
import java.util.*;
public class PerfectNum
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the numeber   ");
 int n =sc.nextInt();
 int temp=n;
 int sum=0;
 
 for(int i=1;i<n;i++)
 {
	 if(n % i == 0)
	 {
		 sum=sum+i;
     }
 }
 if(sum==n)
 {
	 System.out.println("The number is perfect");
 }else
 {
	 System.out.println("the number is not perfect");
 }
}
}
 