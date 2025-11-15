/*Return the first element that repeats in the array.
Input:
arr = {10, 5, 3, 4, 3, 5, 6}
Explanation:
Use a boolean array or nested loops to track seen elements.
Expected Output:
First repeating element is 5
*/
import java.util.*;
public class DuplicateFirst
{
public static void main(String args[])
{
  boolean flag=false;
  int a[]={10,5,3,4,3,5,6};
  int i,j;
  for(i=0;i<a.length;i++)
     {
	     for(j=i+1;j<a.length;j++)
		 {
		    if(a[i] == a[j])
			{
			  System.out.println("this ::"+a[i]);
		      flag=true;
		    	break;
			}
			if(!flag)
			{
				break;
			}
		 }
	 }
	  
}
}