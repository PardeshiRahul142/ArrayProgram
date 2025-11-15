//count digi in Number 
import java.util.*;
public class DigitCountInNumber
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the numbe ");
   int num = sc.nextInt();
   int count=0;
   while(num !=0)
   {
   num /=10;
   ++count;
   }
   System.out.print("the count of number is "+count);
   }
  }