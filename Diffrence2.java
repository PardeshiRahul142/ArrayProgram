/*Q4. Write a program in java to find out the maximum difference between any two elements such that larger element appears after the smaller number.
	Expected Output :
	The given array is : 7 9 5 6 13 2
	The elements which provide maximum difference is: 5, 13
	The Maximum difference between two elements in the array is: 8
*/

import java.util.*;
public class Diffrence2
{
  public static void main(String args[])
  { Scanner sc=new Scanner(System.in);
     int arr[]={7,9,5,6,13,2};
	 System.out.println("Enter the first index :");
	 int ind=sc.nextInt();
	 System.out.println("Enter the second index");
	 int sind=sc.nextInt();
	 if(ind>0&&sind>0 && ind<arr.length && sind<arr.length)
	 {
	    System.out.println("provide maximum difference is: "+ (arr[sind] - arr[ind]));
		System.out.println(arr[sind]  + "  "+ arr[ind]);
		  
	 }
	 else
	 {
		 System.out.println("invalid input :");
	 }
  }
}
	 
