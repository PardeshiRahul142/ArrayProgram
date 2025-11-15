import java.util.Scanner;
public class AddationOfDigit
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number");
int num=sc.nextInt();
int sum=0;

int lastNum=num % 10;
   num =num /10;
   sum=sum+lastNum;

  lastNum=num % 10;
   num =num /10;
  sum=sum+lastNum;

  lastNum=num % 10;
 num =num /10;
 sum=sum+lastNum;

  lastNum=num % 10;
 num =num /10;
 sum=sum+lastNum;



System.out.print("The sum of digit is :"+sum);
}
}
