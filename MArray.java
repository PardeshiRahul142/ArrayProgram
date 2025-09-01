//6.Write a program to find the missing number in an array of n consecutive integers.
package Arr.gth;
public class MArray {
    public static void main(String[] args) 
    {    int a[]= {10,12,23,21,14};
     for(int i=0;i<a.length;i++)
     {
    	   for(int j=i+1;j<a.length;j++)
    	   {
    		   if(a[i] > a[j])
    		   {
    			   int temp=a[i];
    			   a[i]=a[j];
    			   a[j]=temp;
    		   }
    	   }
     }
    	 
    	   System.out.println("Sorted Array :");
    	   for(int i=0;i<a.length;i++)
    	   {
    		   System.out.print(a[i]+" ");
    	   }
    	   System.out.println("");
    	   System.out.println("Missing elements :");
       for(int k=a[0] , count=0 ; k<a[a.length-1];k++)
       {
    	      if(k !=a[count])
    	      {
    	    	    System.out.print(k+" ");
    	      }
    	      else
    	      {
    	    	     count++;
    	      }
    	   }
      }
		
	
}
