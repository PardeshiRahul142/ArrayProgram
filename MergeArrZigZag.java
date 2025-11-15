/*	
Q2. Write a java program to merge two arrays.

	Input - First Array :- 1 2 3 4 5
             	  Second Array :-  6 7 8 9 10 
	Output - 1 10 2 9 3 8 4 7 5 6
*/

import java.util.*;
public class MergeArrZigZag
{
  public static void main(String args[])
  {
    int a[]={1,2,3,4,5};
	int b[]={6,7,8,9,10};

	int start=0;
    int end=b.length-1;
	while(start<=end)
		{
	   int temp= b[start];
	   b[start]=b[end];
	   b[end]=temp;
	   end--;
	   start++;
	   }
	  int i=0 , j=0;
	while( i<a.length && j<b.length)
	{
		System.out.print(a[i] + " "+ b[j]+" ");
		i++;
		j++;
	}
	
 }
}
