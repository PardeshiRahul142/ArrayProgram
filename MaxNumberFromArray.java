// Write a java program to find maximum number from array.
import java.util.*;
public class MaxNumberFromArray
{
   public static void main(String srh[])
   { 
    Scanner sc=new Scanner(System.in);
	int a[]=new int[5];
	int max=a[0];
	System.out.println("Enter the array element");
	for(int i=0;i<a.length;i++)
	  {
	    a[i]=sc.nextInt();
	  }
	  for(int i=1;i<a.length;i++)
	    {
		if(a[i] > max)
		{
			max=a[i];
		}
	
	    }
		System.out.println("The maxium number is "+max);
	}
}
	