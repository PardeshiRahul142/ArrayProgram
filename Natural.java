/*Q1. Write a java program to print all natural numbers from 1 to n. using while loop
*/

import java.util.*;
public class Natural
{
public static void main(String agrs[])
{
Scanner sc= new Scanner(System.in);
System.out.print("Enter the  n ");
int n= sc.nextInt();
 int rev;
int i=1;

while(i<=n)
{
 rev = n % 10;
 sum = sum * 10 +rev ;
  System.out.println(sum);
  i++;
}


}
}
  
 
