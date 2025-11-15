//swapping first and last number 
import java.util.*;
public class LastAndFirstNoSwap
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the number ");
   int num = sc.nextInt();
   int temp,rem, count=0,last ,first;
   temp=num;
   while(num !=0)
    {
	num =num / 10;
	count++;
    }	
	temp =num;
	last=num % 10;
	int p=(int)Math.pow(10,--count);
	first=num/p;
	
	num=num % p;
	num=num / 10;
	
	last=last*p;
	num=num*10;
	num =first+last+num;
	System.out.println("The after swapping number is ::"+num);
	
   }
}
	
 