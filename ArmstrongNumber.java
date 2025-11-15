//armstrong number 
import java.util.*;
public class ArmstrongNumber 
{
 public static void main(String args[])
 {
 Scanner sc= new Scanner(System.in);
 System.out.print("Enter the number ");
   int num=sc.nextInt();
   int rem;
   int result=0;
   int temp = num;
   while(num !=0)
   {
    rem =num % 10;
    result +=rem*rem*rem;
	num = num/10;
	}
	if(result == temp)
	{
		System.out.print("The number is armstrong::");
    }
	else
	{
	System.out.print("The numbet is not armstrong ");
	}
  }   
}