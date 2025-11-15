//Q20. Write a java program to swap first and last digits of a number.
import java.util.*;
public class SwapNumber
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number :");
	  int num=sc.nextInt();
	  int temp,count=0;
	  temp=num;
	  
	  while(num !=0)
	  {
		  num=num/10;
		  count++;
	  }
	  System.out.println("the count is :"+count);
  }
}
	  
