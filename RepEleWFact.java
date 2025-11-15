/*Replace each element with its factorial.
Explanation: Use a loop to compute factorials for each element.
*/
import java.util.*;
public class RepEleWFact{
public static void main(String args[])
{
   int a[]={2,4,5,6,7};
   int b[]=new int[a.length];
   System.out.println("Replce element with factorial :");
   for(int i=0;i<a.length;i++)
   { 
     int n=a[i];
	 int f=1;
	 for(int j=1;j<=n;j++)
	 {
	   f=f*j;
	 }
	 	   b[i]=f;

	}
	for(int i=0;i<a.length;i++)
	{
		System.out.println(b[i]);
	}
}
}