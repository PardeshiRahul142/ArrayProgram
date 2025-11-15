//Q10. Write a java program to count the number of digits in a number.
import java.util.*;
public class DigitCount
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the number:");
 int num=sc.nextInt();
 int count=0;
 for(int i=1;num>0;i++)
 {
	 num /=10;
	 count++;
	
 }
  System.out.print(count);
}
}