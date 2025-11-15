import java.util.*;
public class RemoveDigit
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number more than 1 digit");
int num=sc.nextInt();
int lastDigit=num/10;
System.out.print("Aftert removing last digit number is "+lastDigit);
}
}
