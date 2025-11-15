import java.util.*;
//Write a java program to count the frequency of each element in a given array.
public class FrequencyNumber{
	public static void main(String args[]){
		
	int a[]={10,100,50,90,90};
	int i,j;
	int temp;
	System.out.println("Given array ");
	for(i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	for(i=0;i<a.length;i++)
	{
		
       for(j=i+1;j<a.length;j++)
	   {
		  if(a[i]<a[j])
		  {
               temp=a[i];
               a[i]=a[j];
               a[j]=temp;
	      }
	   }
	  }	
	   System.out.println("sorted array");
	   for(i=0;i<a.length;i++)
	   {
		   System.out.println(a[i]);
	   }
	
		
	 int count=1;
	
	for(i=0; i<a.length;i++)
	{
		if( i==a.length-1)
		{
			System.out.println(a[i] + " " + count +"times");
			break;
		}
		else if(a[i] == a[i+1])
		{
			count++;
		}
		
		else
		{
			System.out.println(a[i] + " " + count +"times");
			count=1;
		}
	}
	
    }
   }


