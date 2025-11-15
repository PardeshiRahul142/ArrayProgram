//Q.3 Write a java program to take 5 elements and display only odd elements from array.
import java.util.*;
public class OddElement
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   int[] a=new int[5];
   System.out.println("Enter the elements in array " );
   for(int i=0;i<a.length;i++)
     {
	 a[i]=sc.nextInt();
	 }
    for(int i=0;i<a.length;i++)
	{
	if(a[i] % 2 !=0)
	{
	 System.out.println("odd number "+a[i]);
    }
     }
  }
}  