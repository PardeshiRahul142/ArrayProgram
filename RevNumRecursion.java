import java.util.*;
public class RevNumRecursion
{
	public static void main(String args[])
	{
		int n=121;
		int res=revNum(n,0);
		System.out.println("the reverse number is :"+res);
		String palres=(n==res) ? "number is palindrome ":"number is not palindrome ";
		System.out.println(res +"is:"+palres);
	}
	public static int revNum(int num , int rev)
	{
		if(num ==0)
		{return rev;
		}
		int rem=num %10;
		rev=rev*10+rem;
		return revNum(num/10,rev);
	}
}