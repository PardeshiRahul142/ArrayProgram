import java.util.*;
public class PositiveNumber
{
public static void main(String a[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int num=sc.nextInt();
if(num>=0)
{
System.out.println("The number is positive");
}
else
{
System.out.println("The number is negative");
}
}
}