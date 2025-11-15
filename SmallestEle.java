//Q4. Find the smallest element in a given array.

import java.util.*;
public class SmallestEle
{
  public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
	 int x[]=new int[5];
  
	 System.out.println("Enter the number :");
	 for(int i=0;i<x.length;i++)
	   {
	     x[i]=sc.nextInt();
	   }
	    int min=x[0];
	  for(int i=1;i<x.length;i++)
	   {
	     if(x[i]<min)
		  {
		    min=x[i];
		  }
	   }
	  System.out.println("the min is :"+min);
	}
}
	  