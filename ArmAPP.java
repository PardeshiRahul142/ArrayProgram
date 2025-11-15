//using another logic to find the armstrong number
import java.util.*;
public class ArmAPP
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the number ");
  int num = sc.nextInt();
  int count=0,p,j,sum=0;
  int temp = num;
  while(num !=0)
  {
  num = num/10;
  count++;
  }
  num=temp;
  while(num !=0)
  {
   int rem = num % 10 ; 
   num = num / 10;
   p=1;
   j=1;
   
   while(j<=count)
   {
   p=p*rem;
   j++;
   }
    
  sum= sum+p;
  }
  if(sum== temp)
  {
	  System.out.print("the number is armstrong:");
  }
  else
  {
	  System.out.print("The number is not arstrong");
  }
  }
  }
   
  