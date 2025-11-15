//Q17. Write a java program to find all factors of a number.

import java.util.*;
public class FactorialNumber
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int fact=sc.nextInt();
int f=1;
for(int i=1;i<=fact ; i++)
{
 f = f*i;
 }
 System.out.println("the factorial is"+f);
 }
 }