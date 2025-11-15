/*Q1. Calculate the average of all elements in an array.
Explanation: First calculate the sum, then divide by array length.
*/
import java.util.*;
public class AvgArrEle
{
	 public static int sumOfAre(int a[])
   {
	  int sum=0;
      for(int i=0;i<a.length;i++)
	   {
	       sum = sum +a[i];
	   }
	   return sum/a.length;
	   
    }
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
	 int arr[]=new int[5];
	 System.out.println("Enter the array element :");
	 for(int i=0;i<arr.length;i++)
	    {
		    arr[i]=sc.nextInt();
		}
	System.out.println("Avrgare of all element :"+sumOfAre(arr));
		
   }
  
}