// WAP input a num and count its digit

import java.util.*;
public class CountDigit
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.print("Enter the number :");

int num = sc.nextInt();
int count=0;
while(num != 0)
{
 num = num / 10;
 ++count;
} 
System.out.print(count);
}
}