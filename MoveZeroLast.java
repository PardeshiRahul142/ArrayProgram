/*Q3. Write a program in java to move all zeroes to the end of a given array.
		Expected Output :
		The given array is : 2 5 7 0 4 0 7 -5 8 0
		The new array is:
		2 5 7 8 4 -5 7 0 0 0*/
import java.util.*;
public class MoveZeroLast
{
   public static void main(String args[])
   {
     int a[]={2,5,7,0,4,0,7,-5,8,0};
	
	 System.out.println("");
	 int k=0;
	 for(int i=0;i<a.length;i++)
	 {
	     if(a[i] != 0)
		 {
		   a[k]=a[i];
		   k++;
		 }
	  }
		while(k<a.length)
		{
		  a[k]=0;
		  k++;
		}
		 for(int i=0;i<a.length;i++)
		 {
		 System.out.print("\n"+a[i]);
		 }
	}
   }