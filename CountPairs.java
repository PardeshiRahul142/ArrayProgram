//Input: arr = [1, 5, 7, -1, 5], sum = 6
//Output: 3 (pairs: (1,5), (7,-1), (1,5))

import java.util.*;
public class CountPairs{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	int a[]={1, 5, 7, -1, 5};
	int i=0;
	System.out.print("Given array :");
	for(i=0;i<a.length;i++)
       {
	      System.out.print("\t"+a[i]);
	   }
	   int k=2;
	   int sum=0;
	for(i=0 ; i<k ;i++)
	  {  
	     sum = sum + a[i];
		  System.out.println("\n("+a[i]+" , " + ""+a[i+1]+")");
	  }
	 
  
    for(i=k ; i<(a.length-1);i++)
	   {
	   sum = sum+a[i]-a[i-k];
	   System.out.println(sum);
	   }
  }
}
