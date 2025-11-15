import java.util.*;
public class ReverseNumber1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the numbers");
int number=sc.nextInt();
int result=0;
 
while(number>0)
{
int lastDigit= number % 10; 
 number = number/10;
 result = result * 10 +lastDigit;
}
System.out.print(result);
}
}