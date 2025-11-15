//Write a java program to print all odd numbers between 1 to 100.

import java.util.*;
public class OddNum
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the number");
  int n=sc.nextInt();
  int i=1;
  while(i<=n)
  {
  if(i%2==1)
  {System.out.print(i+" ");
  
  }
    i++;
  }
}
}