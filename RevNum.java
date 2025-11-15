import java.util.*;
public class RevNum
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
 revNum =revNum*10+lestDigit;  
 n /=10;
}
System.out.println("The reverse Number is "+revNum);
}
}