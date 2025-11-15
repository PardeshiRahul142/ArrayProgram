//Write a java program to calculate the sum of even or odd numbers in a given array.
import java.util.*;
public class SumOFEvenOdd{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
	int a[]={10,20,5,6,40};
	
	System.out.println("Given array :");
	for(int i=0;i<a.length;i++)
	{
	   System.out.println(a[i]);
	}
	
	  int evenSum=0;
	  int oddSum=0;
	System.out.println(" sum of even odd Array : ");
	for(int i=0;i<a.length;i++)
	{
	  
	  int n=a[i];
	  if(n % 2 == 0)
	  {
	   evenSum=evenSum+n;
	  }
	  else
	  {
	    oddSum=oddSum+n;
	  }
	 
	 }//for close

     System.out.println("even : "+evenSum);
	 System.out.println("add : "+oddSum);	 
	 
	



}//main close
}//class close