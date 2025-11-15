//Q16. Write a java program to find power of a number.

import java.util.*;
public class PowerOfNumber
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the base and index");
 int base=sc.nextInt();
 int index=sc.nextInt();
 int p=1;
 for(int i=1; i<=index;i++)
 {
  p=base*p;
 }
 System.out.print("the power is "+ p);
 }
 }
  
  