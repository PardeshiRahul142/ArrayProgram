import java.util.*;
public class MargAraay1{
   public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
	 int a[]=new int[5];
	 int b[]=new int [3];
	 int c[]=new int[a.length + b.length];
	System.out.println("Enter the array a :");
	for(int i=0;i<a.length;i++)
	   {
		  a[i]=sc.nextInt();
	   }
	System.out.println("Enter the array b :");
	for(int i=0;i<b.length;i++)
	   {
	      b[i]=sc.nextInt();
	   }
	System.out.println("merge array :");
	for(int i=0,k=(b.length);i<b.length;i++)
	{
	   c[i]=b[i];
	    if(k < c.length)
		{
		 c[k] = a[k - b.length];
		   k++;
		}
	}
	
	/*for(int i=0;i<b.length;i++)
	{
		c[i]=b[i];
	}
	for(int i=0;i<a.length;i++)
	{
		c[b.length+i]=a[i];
	}*/
	
	//display 
	
	System.out.println("array A :");
	for(int i=0;i<a.length;i++)
	   {
	      System.out.println(i + " ---> " + a[i]);
	   }
	System.out.println("array b :");
	for(int i=0;i<b.length;i++)
	   {
	      System.out.println(i + " ---> " + b[i]);
	   }
	System.out.println("merge array  :");
	for(int i=0;i<c.length;i++)
	   {
	      System.out.println(i + " ---> " + c[i]);
	   }
   }
}
	