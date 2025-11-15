/*4. Write a java program to perform this operation.

	Sample Input: [78, 90, 90, 86, 85, 92, 70, 92]
	Expected Output: 92, 90, 86*/
	
import java.util.*;
public class PerformOperation
{ 
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
	 
	 int a[]={78,90,90,86,85,92,70,92};
	 int k=0;
	 for(int i=0;i<a.length;i++)
	   { 
         boolean flag = false;
	     for(int j=i+1;j<a.length;j++)
		   {
		     if(a[i] == a[j])
			  {
			    flag=true;
				  break;
               }
			}
		if(!flag)
		{
		a[k]=a[i];
		  k++;
		}
	   }
	   for(int i=0;i<k;i++)
	   {
		   System.out.print(a[i]+"  ");
	   }
	   for(int i=0 ; i<k;i++)
	   {
		   for(int j=i+1;j<k;j++)
		   {
			   if(a[i] < a[j])
			   { 
		          int temp=a[i];
				      a[i]=a[j];
					  a[j]=temp;
			   }
			   
		   }
	   }
	   System.out.println("Display element is :");
	    for(int i=0;i<3 && i<k;i++)
		{
			System.out.println(a[i]);
		}
		   
		
   }
}
	 