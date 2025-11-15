import java.util.*;
public class FindMaxElement
{
public static int getMax(int a[])
{
   int max=a[0];
   for(int i=0;i<a.length;i++)
       {
		  if(a[i] > max)
		    {
			    max=a[i];
			}
	   }
	   return max;
}
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  int arr[]=new int[5];
  System.out.println("Enter the array element in array ");
  for(int i=0;i<arr.length;i++)
     {
	     arr[i]=sc.nextInt();
	 }
	 int result=getMax(arr);
	 System.out.print("The maximum number is :"+result);
}
}