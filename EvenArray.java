//Q.2 Write a java program to take 5 elements and display only even  number from array.
import java.util.*;
public class EvenArray
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	int a[]=new int[5];
	System.out.println("Enter the element :");
	for(int i=0;i<a.length;i++)
	{
	 a[i]=sc.nextInt();
	}
	for(int i=0;i<a.length;i++)
	{
	 if(a[i] % 2==0)
	   {
	   System.out.print("Even array "+a[i]);
	   }
	 }
  }
}