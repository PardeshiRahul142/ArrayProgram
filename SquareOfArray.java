/*Q3. Create a new array where each element is the square of the original.
Explanation: newArr[i] = arr[i] * arr[i]; in loop.*/

import java.util.*;
public class SquareOfArray{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
 int a[]={5,10,15,20,25};
 int b[]=new int[a.length];
 System.out.print("Given array :");
 for(int i=0;i<a.length;i++)
    {
	  System.out.print(a[i]+" ");
	}
	System.out.println();
 for(int i=0;i<a.length;i++)
    {
	   b[i]=a[i]*a[i];
	}
  System.out.print("replace element with square :");
  for(int i=0;i<a.length;i++)
     {
	  System.out.print(b[i]+" ");
	 }
 }
}