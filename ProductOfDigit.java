//Write a java program to calculate the product of digits of a number.
import java.util.*;
public class ProductOfDigit
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.print("Enter the number :");
 int num =sc.nextInt();
 int power=1;
 for(int i=1 ; num!=0; i++)
 {
  int rem = num %10;
   power=power*rem;
   num=num/10;
   }
 System.out.print(power);
 }
 }