import java.util.*;
public class Trangle
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter the two angles of program : ");

int a=sc.nextInt();
int b=sc.nextInt();
int c=180-(a+b);
/*if(a<=0|| b<=0 || (a+b)>=180)*/
if((a+b)<180 && a>=0 && b>=0)
{
System.out.println("The value of third angle is"+c);
}
else
{
System.out.println("Invalid");
}

}
}
