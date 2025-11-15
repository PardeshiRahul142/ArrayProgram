import java.util.*;
public class MaxElementSliding
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	int a[]={1,3,2,6,-1,4,1,8,2};
    System.out.println("Givena array ");
    for(int i=0;i<a.length;i++)
    {
       System.out.print("\t"+a[i]);	
	}
	  int k=3;
	  int max=-1;
	for(int i=0 ; i<a.length-k;i++)
	{
	   int csum=0;
		for(int j=i;j<(k+i);j++)
		{
		  csum=csum+a[j];
		}
		  if(csum > max)
		  {
		   max=csum;
		  }
		 
	}
	 System.out.println("max slide is "+ max);
		 
	
  }//main
}//class