//find max and second max number
import java.util.*;
public class SMNum
{
   public static void main(String args[])
   {
   Scanner sc=new Scanner(System.in);
   int[]x=new int[5];
   int max=-1,smax=-1;
   System.out.println("Enter the element ");
   for(int i=0;i<x.length ; i++)
    {
	x[i]=sc.nextInt();
	}
	//find max
	for(int i=0;i<x.length;i++)
	{
	if(x[i] > max)
	{
	max=x[i];
	}
	}
	//smax;
	System.out.println("max number is "+ max);
	for(int i=0;i<x.length;i++)
	{ 
	   if(x[i]>smax && x[i]!= max)
	   {
	      smax=x[i];
	   }
	}
	System.out.println("The Smax is :"+smax);
  }
 }
	
	
	
	
	
	
	
	
	
	
	
	