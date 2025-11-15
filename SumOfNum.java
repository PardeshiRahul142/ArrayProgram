import java.util.*;
public class SumOfNum{

  public static int sum(int n)
 { 
 if(n == 0)
{
  return 1;
}
return n*sum(n-1);
}
public static void main(String args[])
{
 int n=5;
int res=sum(n);
System.out.println("Sum of the digit is :"+res);
}
}