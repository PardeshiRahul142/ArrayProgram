import java.util.*;
public class SWP{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
	int a[]={1,3,7,8};
	int k=2;
	System.out.print("{1,3,7,8}");
	int sum=0;
	for(int i=0;i<=a.length-1;i++)
	{
	   sum=sum+a[i];
	   
	   if(i>k)
	   {
	    System.out.println(sum);
	   sum = sum - a[i-(k-1)];
	   }
	 
	}
  }
}