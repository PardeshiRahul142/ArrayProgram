//
import java.util.*;
public class TwoSlideWindow{
   public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
	  int a[]=new int[5];
	  System.out.println("Enter the number ");
	  for(int i=0;i<a.length;i++)
	  {
		  a[i]=sc.nextInt();
	  }
	  int sum=0;
	  int k=2;
	  for(int i=0;i<=k;i++)
	  {
	    sum=sum+a[i];
	  }
	  int max=sum;
	  for(int i=k;i<a.length;i++)
	  {
	   sum=sum+a[i]-a[i-k];
	   if(sum > max)
	   {
	   max=sum;
	   }
	   	   System.out.println("sum is :"+sum);

	   }
	}
}