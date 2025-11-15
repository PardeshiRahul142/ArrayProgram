//Q18. Write a java program to find the first and last digit of a number.
import java.util.*;
public class FirstAndList
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
   System.out.println("Enter the number :");
   int num=sc.nextInt();
   int count=0;
   int temp=num;
   while(num !=0)
   { 
     num=num/10;
	 count++;
   }
   num = temp;
   int p =1;
   
   for(int i=1;i<count;i++)
   {
	   p=p*10;
   }

   int firstNo=num/p;
   int lastNum=num%10;
   System.out.println("The last Number :"+lastNum);
     System.out.println("The first Number is "+firstNo);
     System.out.println("The power is "+p);
 
   
   }
   
   }
   