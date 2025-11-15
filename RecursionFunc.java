import java.util.*;
public class RecursionFunc{
	static int count=1;
 public static void table(int n)
 {
    if(count <= 10)
      {
	      System.out.println(n*count);
		  count++;
		  table(n);
	  }
	   
 }
 public static void main(String args[])
 { 
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the number :");
   int num=sc.nextInt();
 
   table(num);
 }
 }
 