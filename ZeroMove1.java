//
import java.util.*;
public class ZeroMove1{
   public static void main(String args[]){
   int a[]={0,1,0,3,12};   
     int n=a[i];
    for(int i=0;i<a.length;i++)
	{
	    if(n > 0)
		{
			a[i]=n;
		}
    }
	 for(int i=0;i<a.length;i++)
	 {
	  System.out.println(a[i]);
	 }
   }
}