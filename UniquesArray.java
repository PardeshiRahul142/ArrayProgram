/*Q1. Write a java program to find the unique value from array.

	Input array elements: 1, 2, 3, 5, 1, 5, 20, 2, 12, 10 

	All unique elements in the array are: 3, 20, 12, 10 
*/

import java.util.*;
public class UniquesArray
{ 
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
	 int a[]={1, 2, 3, 5, 1, 5, 20, 2, 12, 10};
	 
	 System.out.println("Given array is  :");
	 for(int i=0;i<a.length;i++)
	  {
	     System.out.print(" "+a[i]);
	  }
	  System.out.println("unique element : ");
	  for(int i=0;i<a.length;i++)
	  {  
      int count=0;
       for(int j=0;j<a.length;j++)
		{
		   if(a[i] == a[j])
		   {
		      count++;
		   }
		}
		if(count==1)
		{
			System.out.println(a[i]);
		}
	  }
	 }
}
	
	   
	   