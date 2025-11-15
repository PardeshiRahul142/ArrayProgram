import java.util.*;
public class AreaOfTriangle
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the height and base");
double base=sc.nextInt();
double height=sc.nextInt();
double AreaOfTriangle=0.5*base*height;
System.out.print("The area of rectangle is "+ AreaOfTriangle);
}
}