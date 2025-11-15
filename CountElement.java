import java.util.*;
public class CountElement{
  public static void main(String args[]){ 
     int a[]={10,20,10,30,40,30,10,20};
     int i,j,temp;
     System.out.println("given array ");
     for(i=0;i<a.length;i++)
     {
	System.out.println(" "+a[i]);
     }
     for(i=0;i<a.length;i++)
     {
        for(j=i+1;j<a.length;j++)
        {
	  if(a[i] > a[j])
          {
	     temp=a[i];
	     a[i]=a[j];
	     a[j]=temp;
	   }
	 }
	 System.out.println(a[i]);
       }
	   
	int count =1;
        for(i=0;i<a.length;i++)
	{
       	  if(i==a.length-1)
	    {
	      System.out.println(a[i]+" "+count +"times");
		break;
	    }
	    else if(a[i]==a[i+1])
	    {
	     count++;
	    }
	    else
	    {
	      System.out.println(a[i]+" "+count+"times");
		count=1;
	     }
	   } 
   }
}