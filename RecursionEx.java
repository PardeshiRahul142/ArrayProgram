import java.util.*;
public class  RecursionEx
{  public static void main(String args[])
  {  Scanner sc=new Scanner(System.in);
    System.out.println(SumOfDig(5));
  }
   public static int SumOfDig(int n)
      {
	      if(n>0)
		    {
			  return n+SumOfDig(n-1);
			}
			return 0;
	  }
}