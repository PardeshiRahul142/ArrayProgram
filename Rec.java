//recursion table
import java.util.*;
public class Rec
{
	static int count =0;
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the number");
   int num=sc.nextInt();
     table(num);
  }
   public static void table(int n){

     if(count < 10)
	 {
	   count++;
       System.out.println(n*count);
	   table(n;
	 }
   
}
}