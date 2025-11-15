//Input: [1, 2, 3] and [2, 3, 4, 5]
//Output: [1, 2, 3, 4, 5]

import java.util.*;
public class MergeArr1
{
  public static void main(String args[])
  {
    int a[]={1,2,3};
	int b[]={2,3,4,5};
    int c[]=new int[a.length+b.length];
	int count=0;
	System.out.print("  A :");
    for(int i=0;i<a.length;i++)
	    {
		    System.out.println(a[i]);
	    }
	System.out.print(" B ");
	for(int i=0;i<b.length;i++)
	    {
		   System.out.print(b[i]);
	    }
	
	System.out.println("Merge array :");
	int k=0;
	for(int i=0;i<a.length;i++)
	    {
	        c[k]=a[i]; 
		      k++;
	    }
	for(int i=0;i<b.length;i++)
	    {
           c[k] = b[i];
		     k++;
	    }
	
	System.out.print("display :");
	 
		for(int i=0;i<c.length;i++)
		{
		   System.out.println(c[i]);
		}
  }
}
		