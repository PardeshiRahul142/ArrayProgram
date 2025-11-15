/*
	Return the first element that repeats in the array.
Input:
arr = {10, 5, 3, 4, 3, 5, 6}
*/
import java.util.*;
public class FirstDuplicateEle
{  public static void main(String args[])
  {  
     int a[]={10,5,3,4,3,5,6};
	 boolean flag=false;
	 for(int i=0;i<a.length;i++)
	   {
		   for(int j=i+1;j<a.length;j++)
		      {
				  if(a[i] == a[j])
				    {
						System.out.println("First repeating element is :"+a[i]);
						flag=true;
						break;
					}
			  
			  }
			  if(flag)
			  { 
		         break;
			  }
	   }
	   if(!flag)
	    {
			System.out.println("no repeted element ");
		}
	 
	   
  }
}