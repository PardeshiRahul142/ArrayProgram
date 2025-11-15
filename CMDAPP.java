/*1.Write program to input two values using command line argument and perform its swapping?*/

import java.util.*;
public class CMDAPP
{ public static void main(String args[])
  {
     int a=Integer.parseInt(args[0]);
     int b=Integer.parseInt(args[1]);
     System.out.println("Before swappnig value :");
     System.out.println("Value of a is :"+ a +" and value of b :"+b);

     a=a+b;
     b=a-b;
     a=a-b;
    System.out.println("After swapping value :");
    System.out.println("Value of a is :"+ a +" and value of b :"+b);
  }
}//class