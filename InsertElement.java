//insrting element in array
import java.util.*;
public class InsertElement
{
   public static void main(String args[])
   {
   Scanner sc=new Scanner(System.in);
   int[]a=new int[6];
   System.out.println("Enter the element in array ");
   for(int i=0;i<(a.length-1);i++)
   {
    a[i]=sc.nextInt();
   }
   System.out.println("Before inserting element ");
   for(int i=0;i<a.length;i++)
   {
   System.out.println(i+"---->"+a[i]);
   }
   System.out.println("Enter the index ");
   int index=sc.nextInt();
   System.out.println("Enter the value ");
   int value = sc.nextInt();
   for(int i=(a.length-2);i>=index;i--)
   {
	   a[i+1]=a[i];	   
   }
   a[index] =value;
   System.out.println("After inserction ");
   for(int i=0;i<a.length;i++)
   {
   System.out.println(i + "----->"+a[i]);
   }
  }
}

	