//print tables in matric 
import java.util.*;
public class DuckAPP
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number ");
  int no=sc.nextInt();
  boolean flag=false;
  while(no !=0)
  {
  int rem=no%10;
     no = no/10;
	 if(rem==0)
	 {
	 flag=true;
	 break;
	 }
  }
     if(flag)
     {
       System.out.print("number is Duck");
     }
     else
     {
       System.out.print("number is not duck");
     }
  }
}