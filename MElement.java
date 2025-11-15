//Write a program in java to find the smallest missing element from a sorted array?
//0 1 3 4 5 6 7 9
import java.util.*;
public class MElement
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   int a[]={0,1,3,4,5,6,7,9};
 System.out.println("Sort array :");
   for(int i=0;i<a.length;i++)
   {
     for(int j=i+1; j<a.length;j++)
	 {
	   if(a[i] > a[j])
	   {
	     int temp=a[i];
		     a[i]=a[j];
			 a[j]=temp;
		}
	  }
	}
	System.out.println("Sorted array  :");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	System.out.println("missing element :");
	for(int i=0,count=0;i<a[a.length-1];i++)
	{
	//	System.out.println(" i   :" +  i  + " coutn  :" + a[count] );
	if(i!=a[count])
	 {
		  System.out.println(i);
	 	//   System.out.println(" i :"+ i + "count : "+ a[count]);
	 }
	 else
	 {
		//    System.out.println(" i :"+ i + "count : "+ count);
	  count++;
	 }
	}
    }
}