/*Q2. Write a program to find first and last digit of a number without using loop in three digit.*/

import java.util.*;
public class LastAndFirstDigit
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int num=sc.nextInt();  //1234


int lastDigit=num % 10;
int firstNum=num /1000;
System.out.print("the lastDigit is "+lastDigit);
System.out.print("The firstnum is "+firstNum);
}
}

