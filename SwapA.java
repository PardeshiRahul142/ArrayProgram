//Input: [1, 2, 3, 4, 5, 6]
//Output: [2, 1, 4, 3, 6, 5]

import java.util.*;
public class SwapA{
  public static void main(String args[])
  {
     int a[]={1,2,3,4,5,6};
	int i=0;
	 for(i=0;i<a.length-1;i+=2)
	    {
	     int temp=a[i];
		 a[i]=a[i+1];
          a[i+1]=temp;
		  System.out.println("a[i]" + a[i] + "a[i+1]"+a[i+1]+"");
		  }
		
      System.out.println("  ");
	  for( i=0;i<a.length ; i++)
	     {
			System.out.print(a[i]);
		 }
     
		
   }
}