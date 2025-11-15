/*
Write a Java program to replace all elements in the array that are multiples of 5 with the number 5 itself.
Input: [ 10, 12, 15, 17, 20 ]
Output: [5, 12, 5, 17, 20 ]
*/
import java.util.*;
public class ReplaceFive
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	int a[]={10,12,15,17,20};
	for(int i=0;i<a.length-1;i++)
	{
	 if(a[i] % 5 == 0 )
	   {
	      a[i]=5;
	  }
	}
	System.out.println("");
	for(int i=0;i<a.length;i++)
	   {
		    System.out.println(a[i]);
	   }
	}
}