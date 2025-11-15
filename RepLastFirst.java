/*
Replace First and Last Element with 0.
Input: [5, 3, 7, 2]
Output: [0, 3, 7, 0]*/

import java.util.*;
public class RepLastFirst
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
	  int a[]={5,3,7,2};
	  System.out.print("Replace last and fisrt element of array :");
	  for(int i=0;i<a.length;i++)
	  {
	    a[0]=0;
		a[a.length-1]=0;
	  }
	  System.out.println("After replcing :");
	  for(int i=0;i<a.length;i++)
	  {
	     System.out.println(a[i]);
	   } 
 }
}