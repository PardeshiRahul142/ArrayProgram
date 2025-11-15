// Write a java program to Check Number Is Duck Number or Not.
import java.util.*;
public class DuckNumber
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.print("Enter the number ");
 int num = sc.nextInt();
 boolean duck=false;
 
 while(num != 0)
 {
  int rem= num%10;
  num =num / 10;
 if(rem == 0)
  {
     duck=true;
       break;
  }
}
  if(duck)
   {
	   System.out.println("number is duck");
   }
   else
   {
	   System.out.println("number is not duck");
   }
}
}
	
  