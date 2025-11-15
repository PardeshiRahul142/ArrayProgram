//Q4. Write a java program to print all even numbers between 1 to 100.- using while loop

import java.util.*;
public class EvenNum
{
public static void main(String arga[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int i=1;
 while(i<=n)
 {   
   if(i%2==0)
   {
	 System.out.print(i);
   }
   i++;
 }
}
}