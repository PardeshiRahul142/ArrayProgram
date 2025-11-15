/* 	 A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.
	 Input : 1412
	Output : Spy Number
	Explanation :
	sum = (1 + 4 + 1 + 2) = 8
	product = (1 * 4 * 1 * 2) = 8
	since, sum == product == 8
 
*/

import java.util.*;
public class SpyNum
{
  public static void main(String args[])
  {
   Scanner sc= new Scanner(System.in);
   System.out.print("Enter the number");
   int num =sc.nextInt();
   int rem=0,sum=0,mul=1;
   int temp=num;
   while(num != 0)
   {
	    rem = num %10;
	   sum = sum + rem;
	   mul = mul * rem;
	   num = num / 10;
 
   
   }
     if(mul == sum)
	 {
		 System.out.println("The number is spy ");
	 }
	 else
	 {
	  System.out.print("The number is not spy :");
	 }
	  
}
}
     