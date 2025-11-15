//
import java.util.*;
public class ZeroMove{
   public static void main(String args[]){
   int a[]={0,1,0,3,12};  
    
   int ind=0;
   for(int i=0;i<a.length;i++)
   {	 
      if(a[i] != 0)
	  {
		a[ind]=a[i];
		   ind++;
		  
	  }
   }
	while(ind < a.length)
	{
		a[ind]=0;
		 ind++;
		 
	}
	
	for(int i=0;i<a.length;i++)
	{
	   System.out.println(a[i]);
	}
 }
}