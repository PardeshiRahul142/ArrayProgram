//Write a C program to find the sum of the first and last digit of a number.

import java.util.*;
public class FLAPP
{
   public static void main(String args[])
   {
 
       int num=1234;
       int temp=num;
       int count=0;
       while(num!=0)
       {
          num/=10;
          count++;
       }
        num=temp;
       int last=num%10;
       System.out.println("last :"+last);
       count+=1000;
       
      int first=temp/count;
      System.out.println("first :"+first); 
     System.out.println("count of first and last number is :"+(last+first));
  }
}