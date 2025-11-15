//Q.5 Write a java program to calculate sum of all elements from a given array. 
import java.util.*;
public class SumOfElement
{
   public static void main(String args[])
   {
   int a[]=new int[5];
   int sum=0;
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the element ");
	for(int i=0;i<a.length;i++)
	{ 
	 a[i]=sc.nextInt();
	}
	for(int i=0;i<a.length;i++)
	{ 
	 sum=sum+a[i];
	}
	System.out.println("Sum is :"+sum);
	}
}