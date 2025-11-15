/* To check number is duck or not */
import java.util.*;
public class DuckNum
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number : ");
  int num = sc.nextInt();
  boolean flag=false;
    while(num !=0)
    {
       int rem=num % 10 ;
       num = num / 10;
      if(rem==0)
      {
       flag = true;
	   break;
      }
    }
	if(flag)
	{
	System.out.print("The number is duck");
	}
	else
	{
	System.out.print("The number is not duck");
	}
  }
}
  
  
  