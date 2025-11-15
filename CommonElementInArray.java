//Q10. Write a java program to find common elements between two arrays.
import java.util.*;
public class CommonElementInArray
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	int a[]={5,4,8,3,10,7,1};
	int b[]={7,5,8,2, 1,6,19};
	int size=a.length + b.length;
	int c[]=new int[size];
	int index=0;
	System.out.println(" ");
	for(int i=0;i<a.length;i++)
	{ 
	 for(int j=0 ; j<b.length;j++)
	 {
	   if(a[i] == b[j])
	   {
		  c[index]=a[i];
		     index++;
	   }  
	 }
    }
	System.out.println("Common element :");
	for(int i=0 ; i<index;i++)
	{
		System.out.println(c[i]);
	}
 }
}
  