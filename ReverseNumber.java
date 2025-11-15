import java.util.*;
public class ReverseNumber1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the numbers");
int n=sc.nextInt();
int revNum=0;

while(n>0)
{
int lestDigit=n%10; 
 revNum *=lestDigit;  
 n /=10;
}
}
}