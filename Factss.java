/*Q6. Write a program to find factorial of a number using for loop*/

import java.util.*;
public class Factss
{
  public static int fact(int n)
  {
    if(n==0)
    { return 1;
    }
    return n*fact(n-1);
 
  }

 public static void main(String args[])
 {
  System.out.println("\t"+fact(5));
 }
}//class