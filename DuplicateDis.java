/*Q1. Write a java program to find the duplicate value from array.

	Input array elements: 1, 2, 3, 5, 1, 5, 20, 2, 12, 10 

	All unique elements in the array are: 1,2,5;
*/
import java.util.*;
public class DuplicateDis
{
  public static void main(String args[])
  {
    int a[]={1, 2, 3, 5, 1, 5, 20, 2, 12, 10};
	int k=0;
	int b[]=new int[a.length];
	 for(int i=0;i<a.length;i++)
	 {
	    boolean isDuplicate=false;
		for(int j=i+1;j<a.length;j++)
		{
		  if(a[i] == a[j])
		  {
		   b[k]=a[i];
		    k++;
		  }
		}
	}
	for(int i=0;i<k;i++)
	{
	System.out.print(b[i]);
	}
	}
}