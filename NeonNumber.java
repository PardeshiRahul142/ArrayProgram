//. Write a java program to Check Number Is Neon Number or Not.
import java.util.*;
public class NeonNumber
{
public static void main(String argd[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the number ");
 int num=sc.nextInt();
 int sum=0;
 int square = num * num ;
  while(square > 0)
	{
	    int rem=square % 10;
		 sum = sum + rem;
         square=square/10;
	}
	
System.out.println("sum"+sum);
	if(num==sum)
	{
	System.out.println("neon number");
	}
	else
	{
		System.out.println("not neon number");
	}

}
}