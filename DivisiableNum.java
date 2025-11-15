/*Write a java program to check whether a number is divisable by 5 and 11 or not  */

import java.util.*;
public class DivisiableNum
{
public static void main(String arf[])
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter the number which divisiable to 5 and 11");

int num=sc.nextInt();
if((num % 5==0 ) && (num % 11 ==0))
{
System.out.print("The number is divisable");
}
else
{
System.out.println("The number is not divisiable");
}
}
}