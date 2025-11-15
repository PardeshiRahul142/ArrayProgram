//using single pass approach
import java.util.*;
public class SingPassSmax
{  public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
	 int a[]=new int[5];
	 int smax=-1,max=-1;
	 System.out.println("Enter the array element ");
	  for(int i=0;i<a.length;i++)
	  {
	    a[i]=sc.nextInt();
	  }
	  for(int i=0;i<a.length;i++)
	   { 
	      if(a[i] > max)
		  {
		    smax=max;
			max=a[i];
		  }
		  else if(a[i] > smax && a[i] !=0)
		  {
		    smax=a[i];
		  }
		}
		System.out.println("Smax number is  : " + smax);
	}
}