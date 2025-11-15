/*Q7. Write a program to check if a number is strong number (sum of factorial of digits = number).*/

import java.util.*;
public class St
{ public static void main(String args[])
  { 
    for(int k=1;k<200;k++)
    {
    int temp=k;
    int sum=0;
    while(temp!=0)
    {
      int rem=temp%10;
      int f=1;
      for(int i=1;i<=rem;i++)
      { f=f*i;
      }
       temp/=10;
       sum=sum+f;
   }
    if(sum==k)
    { System.out.println("Number is strong "+k);
    }
   
   }
  }
}//class