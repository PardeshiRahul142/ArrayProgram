// sub array sum 
import java.util.*;
public class SubArray{
   public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
	 int a[]=new int[8];

	 System.out.println("enter the array element :");
	 for(int i=0;i<a.length;i++){
	   a[i]=sc.nextInt();
	 }
	    int max=0;
	    int sum=-1;
	 	int k=3;
		for(int i=0;i<=(a.length-k);i++)
		{ 
		  int csum=0;
		   for(int j=i;i<=k+i;j++)
		   {
		      csum=csum+a[j];
		   }
		   if(csum > max)
		   {
		     max=csum;
		   }
		   System.out.println(max);
		}
    }
}
	 