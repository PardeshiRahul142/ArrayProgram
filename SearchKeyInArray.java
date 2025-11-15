//Search element in array
import java.util.*;
public class SearchKeyInArray
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	int a[]=new int[5];
	System.out.println("Enter the element in array:");
	 for(int i=0;i<a.length;i++)
	  {
	    a[i]=sc.nextInt();
	  }
     System.out.println("Enter the search key");
     int skey=sc.nextInt();
     int index=-1;
    for(int i=0;i<a.length;i++)
     {
       if(a[i] == skey)
        {
		 index=i;
        }	
     }
       if(index !=-1)
        {
         System.out.println("found");
        }
        else
        {
		  System.out.println("not found");
        }
   }
}   