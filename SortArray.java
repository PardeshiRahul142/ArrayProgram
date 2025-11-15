//Array sort
import java.util.*;
public class SortArray{
   public static void main(String args[]){
	  
	 
	 Scanner sc=new Scanner(System.in);
	 int a[]=new int[5];
	 System.out.println("inter the values in arrays");
	 for(int i=0;i<a.length;i++)
	 {
		 a[i]=sc.nextInt();
	 }
     System.out.println("Before sorting the arrays values");
	 int i,j;
	 for(i=0;i<a.length;i++)
	 {
	   System.out.println(a[i]);
	 }
	 for(i=0;i<a.length;i++)
	  { 
		 for(j=i+1;j<a.length;j++)
	     {
		    if(a[i] < a[j])
		    {
			   int temp = a[i];
			    a[i] = a[j];
				a[j] = temp;
			}
		 }
	  }
	 System.out.println("after sorting the arrays values");
	 for(i=0;i<a.length;i++)
	 {
	   System.out.println(a[i]);
	 }
			    	    
	}
}