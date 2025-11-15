//Q13. Write a java program to enter a number and print its reverse.
import java.util.*;
public class RevNumForloop
{
  public static void main(String sr[])
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the numbr");
  int num=sc.nextInt();
  int rem=0;
  for(int i=1;num!=0;i++)
  {
   int rem=num %10;
   rem=rem*10+rem;
   num =num /10;
  }
  System.out.println("the reverse number is :"+sum);
  }
  }
 
  