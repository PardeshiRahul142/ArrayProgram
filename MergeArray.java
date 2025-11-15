//merge two array
import java.util.*;
public class MergeArray
{
   public static void main(String argsp[])
   {
     Scanner sc=new Scanner(System.in);
	 int[]a=new int[5];
	 int[]b=new int[5];
	 int[]c=new int[a.length + b.length];
	 System.out.println("Enter the first array :");
	 for(int i=0; i<a.length;i++)
	 {
	   a[i]=sc.nextInt();
	 }
	 System.out.println("Enter the second array :");
	 for(int i=0; i<a.length;i++)
	 {
	   b[i]=sc.nextInt();
	 }
	 for(int i=0,k=(a.length); i<a.length ; i++)
	 { 
	   c[i]=a[i];
	   if(k>c.length)
	   {
	   c[k]=b[i];
	      k++;
	   }
	  
	 }System.out.println("the merge array is :");
	 for(int i =0 ; i< c.length; i++)
	 {
	 System.out.println(""+c[i]);
	 }
  }
}