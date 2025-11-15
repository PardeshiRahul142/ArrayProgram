/* Write a java program to find maximum between two numbers.*/

import java.util.*;
public class MaxNum
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
System.out.println("Enter the two number");
int num1=sc.nextInt();
int num2=sc.nextInt();

if(num1<=num2)
{
System.out.println("The num2 is grater then num1");
}
else{
System.out.print("the num1 is grater then num2");
}
}
}
