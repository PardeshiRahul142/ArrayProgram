import java.util.*;
public class FacNum
{  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	int res= fact(5);
	System.out.println(res);
  }
  public static int fact(int n)
  {
    if(n>0)
	{
	 return n*fact(n-1);
	}
    return 1;
  }
}