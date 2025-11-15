/*Q2. Problem: Find the smallest sum of any k consecutive elements in an array.
// Input: arr = [4, 2, 1, 7, 8, 1, 2, 8, 10], k = 3
// Output: 4 (1+2+1)
*/
import java.util.*;
public class SmallestSlide
{
  public static void main(String args[])
  {
    int arr[]={4,2,1,7,8,1,2,8,10};
	int k=3;
	int sum=0;
	for(int i=0 ; i<k;i++)
	{
	 sum =sum + arr[i];
	}
	 int minStart=0;
	 int min=sum;
	
	 for(int i=k ; i<arr.length;i++)
	 {
	  sum =sum + arr[i]-arr[i-k];
	  
	 if(sum < min)
	 {
	    min=sum;
	    minStart++;
	 }
	 }
	 System.out.println(min);
	  for(int i=minStart;i<minStart+k;i++)
	 {
		 System.out.print(arr[i]+",");
	 }
	 }
 }
