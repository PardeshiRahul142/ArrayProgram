/*Q1. Problem: Given an array of integers and a number k, find the maximum sum of any k consecutive elements.
Example Input: arr = [1, 4, 2, 10, 23, 3, 1, 0, 20], k = 4 
Output: 39 (10+23+3+1)
*/

import java.util.*;
public class SlidingK
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
  int arr[]={1,4,2,10,23,3,1,0,20};
   int k=4;
   int sum=0;
   for(int i=0 ; i<k;i++)
   {
      sum +=arr[i];
   }
   int startInd=0;
   int max=sum;
   for(int i=k;i<arr.length;i++)
   {
    sum =sum+arr[i]-arr[i-k];
	
	if(sum > max
	{
	   max=sum;
	   startInd++;
	}
	}
	System.out.println(startInd);
	System.out.println(max);
	for(int i=startInd;i<startInd+k;i++)
	{
		System.out.print(""+arr[i]+",");
	}
 }
}