//Two dimesional array
import java.util.*;
public class TwoArray{
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   int a[][]=new int[3][3];
   System.out.println("Enter the element in array :");
   for(int i=0;i<a.length;i++)
   {
     for(int j=0;j<a.length;j++)
	 {
	    a[i][j] = sc.nextInt();
		}
	}
	System.out.println("Display array : ");
	for(int i=0;i<a.length;i++)
	{
	 for(int j=0;j<a.length;j++)
	 {
	    System.out.print(a[i][j]);
	 }
	 System.out.println();
	}
}
}