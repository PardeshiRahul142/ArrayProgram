// Write a java program to Check Number Is Strong Number or Not.

import java.util.*;
public class StrongNumber
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int num=sc.nextInt();
 int temp=num;
 int f=1;
  for(int i=1;i<=num;i++)
  {
   f=f*i;
  }
  if(temp == f )
  {
  System.out.println("The number is strong");
  }
  else
  {
  System.out.pritnln("the number is not strong");
  }
  }
}
 
