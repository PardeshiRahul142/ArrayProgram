/*Q1. Write program to create class name as Factorial with two functions
       void setValue(int x): this function accept number as parameter
      int getFactorial(): this function can calculate factorial of number and return it.
*/

import java.util.*;
public class FactorialWithFuncation
{ 
  int num=0;
  public void setValue(int x)
  { 
   System.out.println("the value of x  is :"+x);
    num=x;
  }
  public int getFactorial()
  { int f=1;
   for(int i=1;i<=num;i++)
   {   f=f*i;  
   }
    return f;
  }
 public static void main(String args[])
 { Scanner sc=new Scanner(System.in);
   
   FactorialWithFuncation fc=new FactorialWithFuncation();
                          fc.setValue(5);
                          System.out.println(fc.getFactorial());
                          
 }
}