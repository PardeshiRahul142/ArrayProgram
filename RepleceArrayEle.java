//Replace all negative numbers in the array with 0.
//Input: [2, -3, 4, -1, 5]
//Output: [2, 0, 4, 0, 5]

import java.util.*;
public class RepleceArrayEle
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
	 int a[]={2,-3,4,-1,5};
	 int size=a.length;
	 for(int i=0;i<size;i++)
	 {
	  if(a[i]<0)
	  {
	   a[i]=0;
	   }
	 }
	 System.out.println("after replacing array :");
	 for(int i=0;i<a.length;i++)
	 {
	    System.out.println(a[i]);
	  }
	}
}