//FIBONACCI SERIES
import java.util.*;
public class FibSeries
{
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 int f1=0,f2=1,fib;
 System.out.println("Enter the number of iteration");
 int limit=sc.nextInt();
for(int i=1;i<=limit;i++)
{
fib=f1+f2;
f1=f2;
f2=fib;
System.out.println("The fibonacci series is :"+fib);
}
}
}