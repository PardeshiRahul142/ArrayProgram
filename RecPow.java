//
//Example: WAP to create function name as void power(int base,int index) and input two number and calculate its power using recursion 
import java.util.*;
public class RecPow
{ 
   static int p=1;

 public static void main(String args[])
   {    Scanner sc=new Scanner(System.in);
       System.out.print("Enter the base");
	   int base=sc.nextInt();
	   System.out.println("Enter the index");
	   int index=sc.nextInt();
	   power(base,index);
	 }
	   public static void power(int base , int index)
	   {
	     if(index !=0)
		 {
		  p = p * base;
		 power(base,--index);
	   }
	   else
	   {
	   System.out.println(" power is :"  +p);
	   }
	   
	   }  
}
