/*Q1. Write a program in java to print next greater elements in a given unsorted array. Elements for which no greater element exists, consider the next greater element as -1.
		Expected Output :
		The given array is : 5 3 10 9 6 13
		Next Bigger Elements are:
		Next bigger element of 5 in the array is: 10
		Next bigger element of 3 in the array is: 10
		Next bigger element of 10 in the array is: 13
		Next bigger element of 9 in the array is: 13
		Next bigger element of 6 in the array is: 13
		Next bigger element of 13 in the array is: -1
		Next Bigger Elements Array:
		10 10 13 13 13 -1
		*/
import java.util.*;
public class NextGreater{
public static void main(String args[])
{ 
  int a[]={50,3,10,9,6,13};
  int size=a.length;
  int b[]=new int[size];
  System.out.println("Given array is :");
   for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+"  ");
	}
	
	  System.out.println();
	 
	 
    for(int i=0;i<size;i++)
	{
		 int nextGre=-1;
	  for(int j=i+1;j<size;j++)
	  {
	    if(a[i]<a[j])
		{
          nextGre=a[j];
		   break;
		}
	  }
	  b[i]=nextGre;
	 System.out.println("Next bigger element of " + a[i]+" in the array is: "+nextGre);
	  
	}
	System.out.println("Next bigger element in array :");
	for(int i=0;i<size;i++)
	{
		System.out.println("\t"+b[i]);
	}
}
}