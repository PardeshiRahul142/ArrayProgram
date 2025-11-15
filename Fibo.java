/*Q5. Write a program to display Fibonacci series up to n terms using a for loop.*/

import java.util.*;
public class Fibo
{ public static void main(String args[])
  {
   int n=10;
   int a=0,b=1;
   System.out.println(a);
   for(int i=0;i<=n;i++)
   { 
     int num=a+b;
     System.out.print("\t"+num);
       a=b;
       b=num;
   }
  }
}//class