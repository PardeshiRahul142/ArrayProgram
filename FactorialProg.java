//odd print using recur
public class FactorialProg
{
	public static void main(String args[])
	{
		int n=5;
		int res=fact(5);
		System.out.println(res);
	}
	public static int fact(int num)
	{
		if(num==0)
		{
			return 0;
		}
		return num+fact(num-1);
	}
}