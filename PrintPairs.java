/*Print all pairs of elements whose sum equals a target number.
Explanation: Use nested loops and check if arr[i] + arr[j] == sum.
*/

import java.util.*;
public class PrintPairs{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a[]={1,5,2,8,4,2};
int targetNum=6;
int sum=0;
System.out.println("pairs of elements whose sum equals a target number :");
for(int i=0;i<a.length;i++)
   {
  for(int j=i+1;j<a.length;j++)
    {
	 
	  if(a[i]+a[j] == targetNum)
	  {
		   System.out.println(a[i]+""+a[j]);
		 
	  }
	    

    }
	
   }
}
}
	