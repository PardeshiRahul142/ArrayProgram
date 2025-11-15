//second max element in array  using two pass approach ;
import java.util.*;
public class SecEleArray
 {  public static void main(String args[])
     {
          Scanner sc =new Scanner(System.in);
          int a[]=new int[5];
          int smax =-1 , max=-1;
          System.out.println("Enter the element in array ");
            for(int i=0;i<a.length;i++)
            {
                a[i]=sc.nextInt();
            }				
		    for(int i=0;i<a.length;i++)
		    {
			  if(a[i] > max)
			   {
			     max=a[i];
			   }
			}
			for(int i=0;i<a.length;i++)
			{
			 if(a[i]>smax && a[i] !=max)
			   { 
			     smax=a[i];
			   }
		    }
			System.out.println("Small max is :"+smax);
	 }
}