import java.util.*;
public class InsertElementInA{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   int a[]=new int[5];
   System.out.println("Enter the array element ");
   for(int i=0;i<a.length-1;i++)
      {
          a[i]=sc.nextInt();
      }
	System.out.println("Before array :");
	for(int i=0;i<a.length;i++)
	   {
	       System.out.println(i+"--->"+a[i]);
	   }
        System.out.println("Enter the index :");
		int index=sc.nextInt();
		System.out.println("Enter the element ");
		int value=sc.nextInt();

		for(int i=(a.length-2);i>=index;i--)
		   {
		     a[i+1]=a[i];
		   }
		   a[index]=value;
		System.out.println("after insert element in array :");
		for(int i=0;i<a.length ; i++)
		   {
		      System.out.println(i+" "+a[i]);
		   }
	}
}