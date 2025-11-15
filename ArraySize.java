//enter the array size from use and input array element from it;
import java.util.*;
public class ArraySize
{
	public static void main(String args[])
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the size of array ");
	  int n = sc.nextInt();
	  int[] a=new int[n];
	  System.out.println("Enter the element ");
		for(int i=0 ;i<a.length;i++)
		{
		 a[i] =sc.nextInt();
		}  
		System.out.println("Display array :");
		for(int i=0 ; i<a.length ; i++)
		{ 
		  System.out.println(i + "--->" + a[i]);
		}
	}
}
		  