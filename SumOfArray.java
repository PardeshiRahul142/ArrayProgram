import java.util.*;
public class SumOfArray
{  public static void main(String args[])
  {  Scanner sc=new Scanner(System.in);
     int a[][]=new int[2][2];
	 System.out.print("Enter the element in array ");
	 for(int i=0;i<a.length;i++)
	 {
	   for(int j=0;j<a.length;j++)
	   {
	     a[i][j]=sc.nextInt();
	   }
	 }
	 System.out.println("Display array :");
	 for(int i=0;i<a.length;i++)
	 {  int sum=0;
	   for(int j=0;j<a.length;j++)
	   {
	     sum=sum+a[i][j];
		 System.out.print(a[i][j]);
	   }
	   System.out.println("sum is :"+sum);
	 }
  }
}
	 
