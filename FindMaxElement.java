package Arr.gth;
import java.util.*;
public class FindMaxElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		int max=0;
		int smax=0;
		System.out.println("Enter the array :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("display");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("\t"+arr[i]);
		}
         for(int i=0;i<arr.length;i++)
         {
        	     if(arr[i] > max)
        	     {
        	    	    max=arr[i];
        	    	 
        	    	  }
         }
         for(int i=0;i<arr.length;i++)
         {
        	   if(arr[i] > smax && arr[i] !=max)
        	   {
        		   smax=arr[i];
        	   }
         }
         System.out.println("Smax value is :"+smax);
	}

}
