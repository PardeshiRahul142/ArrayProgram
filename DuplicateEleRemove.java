//Input: [1, 2, 3] and [2, 3, 4, 5]
//Output: [1, 2, 3, 4, 5]

import java.util.*;
public class DuplicateEleRemove
{  
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
	  int a[]={1,2,3};
	  int b[]={2,3,4,5};
	  int c[]=new int[a.length+b.length];
	  int i,j,k=0;
	  System.out.println("merge array:");
	  for(i=0;i<a.length;i++)
	     {
			 c[k]=a[i];
			  k++;
		 }
	  for(i=0;i<b.length;i++)
	     {
			 c[k]=b[i];
			   k++;
		 }
		 int temp=0;
		/* System.out.print("Sort array :");
		 for(i=0;i<c.length;i++)
		    {
				for(j=i+1;j<c.length;j++)
				   {
					   if(c[i] > c[j])
					     {
							 temp=c[i];
							 c[i]=c[j];
							 c[j]=temp;
						 }
				   }
			}*/
			System.out.print("After Sorti array :");
			for(i=0;i<c.length;i++)
		   {
			   System.out.println(c[i]);
		   }
			
	     int size=c.length;
		for(i=0 ; i<size-1;i++)
		   {
			   for(j=i+1;j<size;j++)
			      {
					if(c[i] == c[j])
					  {
					    for(k = j; k <size-1; k++)
					    	{
							   c[k]=c[k+1];
							}	
                            j--;
				            size--;							
					  }
					  
				   }
				   
				  
		   }
		System.out.println("After removing array :");
		for(i=0;i<size;i++)
		   {
			   System.out.println(c[i]);
		   }
	
	   
		
	}
}
