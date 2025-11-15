/*Q2. Print elements that are greater than a given number x.
Explanation: Use if (arr[i] > x) inside the loop.
*/
import java.util.*;
public class GivenNum
{ 
 public static void main(String args[])
 { 
   Scanner sc=new Scanner(System.in);
   int a[]={10,30,50,40,30};
   System.out.println("Enter the x ");
   int x=sc.nextInt();
   boolean flag=false;
   for(int i=0;i<a.length;i++)
      {
	      if(a[i] > x)
		    {
			 flag = true;
			}
		  
	  }
	  if(flag)
	  {
		 System.out.println("x is smaller  "); 
	  }
	  else
	  {
		  System.out.println("x is greater");
	  }
  }
}