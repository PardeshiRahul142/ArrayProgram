//WAP CREATE FUNCTION NAME IS INT GETMAX(INT A[] ) THIS FUNCTION IS USED FIND MAX VALUE  and return it;

import java.util.*;
public class MaxFunction{

  public static int getMax(int a[])
   {
      int max=a[0];
      for(int i=0;i<a.length;i++)
     {
        if(a[i] > max)
        {
         max=a[i];
        }
     }
         return max;
   }

  public static void main(String args[]){

   Scanner sc=new Scanner(System.in);

   int a[]=new int[5];
   System.out.println("Enter the values in array");
   for(int i=0;i<a.length;i++)
   {
      a[i]=sc.nextInt();
   }
     int max=getMax(a);
    System.out.println("the maximum number is "+ max);
   }
  
 }