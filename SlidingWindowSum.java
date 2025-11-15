import java.util.*;
public class SlidingWindowSum{
   public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
	 int a[]={2,1,5,1,3,2};
	 int k=3;
	 System.out.println("Given array ");
	 for(int i=0;i<a.length;i++)
	 {
	     System.out.println(a[i]);
	  }
	  int sum=0;
	  for(int i=0;i<k;i++)
	  {
	   sum=sum+a[i];
	  }
	  System.out.println(" sum 1 to 3 : "+sum);
	  for(int i=k;i<=a.length-1;i++)
	  {
	    sum = sum+a[i]-a[i-k];
            System.out.println(a[i]-a[i-k]);
	    System.out.println(sum+" ");
	  }
	}
}