//reversed array
import java.util.*;
public class ReversedArr
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   int a[]=new int[5];
   System.out.println("Enter the element :");
    for(int i=0;i<a.length;i++)
	 {
	 a[i]=sc.nextInt();
	 }
	 System.out.println("before reversed array");
	 for(int i=0;i<a.length;i++)
	  {
	   System.out.println(i +"--->"+a[i]);
	  }
	  int left=0, right=(a.length-1);
	  while(left<=right)
	  {
	   int temp=a[left];
	       a[left]=a[right];
		   a[right]=temp;
		   right--;
		   left++;
	   }
	   System.out.println("after reversed array :");
	   for(int i=0;i<a.length;i++)
	   {
	   System.out.println(i+"--->"+a[i]);
	   }
	}
}