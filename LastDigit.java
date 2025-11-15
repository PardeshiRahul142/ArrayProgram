/*  123  from display 3*/

import java.util.*;
public class LastDigit
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number \t");
int num=sc.nextInt();
int last=num%10;
System.out.print("the last digit in number is "+last);
}
}



