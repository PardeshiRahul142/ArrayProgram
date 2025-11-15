/*Q2. Write a program to calculate the sum of first 10 natural numbers using a while loop.
*/

import java.util.*;
public class SumOfNatNum
{ public static void main(String args[])
  {
    int n=10;
    int sum=0;
    int i=1;
  
    while(i<=n)
    {sum=sum+i;
      i++;
    }
    System.out.println("Sum of 10 natural number is :"+sum);
 
  }
}//class