/*Q1. Write a Java program to print all even numbers from 1 to 50 using a for loop.*/

import java.util.*;
public class NEven
{  public static void main(String args[])
   {
     int n=50;
   
     for(int i=1;i<=n;i++)
     { if(i%2==0)
       {  System.out.println(i);
       }
     }
   }//main
}//class