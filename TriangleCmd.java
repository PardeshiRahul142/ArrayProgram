public class TriangleCmd
{
public static void main(String x[])
{
int a=Integer.parseInt(x[0]);
int b=Integer.parseInt(x[1]);
int c=180-(a+b);
if(a>=0 && b>=0 && (a+b)<180)
{
System.out.print("The Third triangle is "+c);
}
else
{
System.out.println("invalid");
}
}
}