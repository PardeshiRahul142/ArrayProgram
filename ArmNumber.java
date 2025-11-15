//armstrong number 
import java.util.*;
public class ArmNumber
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number ");
  int num =sc.nextInt();
  int temp=0;
  int count=0;
  int rem=0;
  int sum=0;
 while(num > 0)
 {
	 num = num /10;
	 count++;
 }
 num =temp;
 
 for(int i=1 ; i<=num;i++)
 {
	 rem=num %10;
	
	 
	 int p=1;
	 int j=1;
	 
	 while(j<=count)
	 {
		 p=p*rem;
	 } 
	  j++;
	  sum = sum + p;
	  num = num /10;
 }
  
   String str = num == sum ? "Armstrong number " : "Not armstrong number ";
   System.out.println(str);
}
}