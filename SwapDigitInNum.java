//Q20. Write a java program to swap first and last digits of a number.
import java.util.*;
public class SwapDigitInNum
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number :");
	  int num=sc.nextInt();
	  int temp,count=0;
	  temp=num;
	  
	  while(num !=0)
	  {
		  num=num/10;
		  count++;
	  }
	  num=temp;
	  int p=1;
	  for(int i=1;i<count;i++)
	  {
		  p=p*10;
	  }
	  System.out.println("The power is :"+p);
	  
	  int lastNo = num %10;
	  int firstNo=num /p;
	    num = num % p;
	    num = num /10;
		
		lastNo = lastNo * p ;
		num = num * 10;
		num=firstNo+num+lastNo;
		System.out.println("The last Number is :"+num);
	
	  
	
	 
	  
  }
}
	  
