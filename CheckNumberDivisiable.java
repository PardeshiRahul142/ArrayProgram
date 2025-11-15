/*Write a Java program to check whether a number is divisible by 5 and 11 or not.*/

import java.util.*;
public class CheckNumberDivisiable
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number  :");
int no = sc.nextInt();

if(no % 5 == 0 && no % 11 ==0)
{ 
  System.out.print("The number is divisiable " + no);
}
else
{
 System.out.println("The number is not divisiable"+no);
}
}
}
