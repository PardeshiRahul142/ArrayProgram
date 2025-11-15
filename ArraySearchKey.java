//array search key
import java.util.*;
public class ArraySearchKey
  {
	 public static void main(String args[])
     {  
      Scanner sc=new Scanner(System.in);
	  int[]a=new int[5];
	  System.out.println("Enter the number ");
	  for(int i=0;i<a.length;i++)
	   {
	     a[i]=sc.nextInt();
	   }
	   System.out.println("Enter the key value ");
	   int skey=sc.nextInt();
	   int index=-1;
	   for(int i=0;i<a.length;i++)
	    {
		   if(a[i]==skey)
		     {
			 index=i;
			 }
		}
		if(index != -1)
		  {
		    System.out.println("number is found "+index);
		  }
	     else
		  {
		   System.out.println("number is not found");
	      }
   }
}
 
