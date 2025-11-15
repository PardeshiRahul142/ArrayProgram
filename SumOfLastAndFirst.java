//Q19. Write a java program to find the sum of the first and last digit of a number.
import java.util.*;
public class SumOfLastAndFirst
{
public static void main(String srgs[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number :");
int num = sc.nextInt();
int temp=num;
int count=0;
while(num !=0)
{
 num = num/10;
 count++;
}
num=temp;
int p=1;
for(int i=1; i<count ; i++)
{
  p=p*10;
}
int lastNo = num %10;
int firstNo = num /p;
int Sum = lastNo+firstNo;

System.out.println("lastNo"+lastNo);
System.out.println("firstNo "+firstNo);
System.out.println("The sum of first and last digit is :"+Sum);

}
}

 