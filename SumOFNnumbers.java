import java.util.*;
public class SumOFNnumbers
{
	public static void main(String args[])
	{
		int n=10;
		int result=sum(n);
		System.out.println("the sum of 0 to"+n+"is :"+result);
	}
	public static int sum(int n)
	{
		int sum =0;
		if(n==1)
		{
          return 1;
        }
		return n + sum(n-1);
	}
}