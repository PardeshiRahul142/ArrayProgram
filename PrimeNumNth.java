//Write a java program to display 1 to nth Prime Number.
import java.util.*;
public class PrimeNumNth
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number ");
int num = sc.nextInt();

for(int i=2 ; i<= num ; i++)
{
	boolean isPrime =true;
	for(int j=2;j<=i/2;i++)
	{
		if(num % j ==0)
		{
			isPrime=false;
			break;
		}
	}
	if(isPrime)
	{System.out.println(i);
	}

}
}
}