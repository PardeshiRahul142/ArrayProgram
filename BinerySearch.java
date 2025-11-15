// binery search 
import java.util.*;
public class BinerySearch
{  public static void main(String args[])
   { 
      Scanner sc=new Scanner(System.in);
	  int a[]=new int[5];
	  System.out.println("Enter the number : ");
	  for(int i=0;i<a.length;i++)
	    {
		  a[i]=sc.nextInt();
		}
		System.out.println("Enter the Search key ");
		int skey=sc.nextInt();
		int index=-1;
		int left=0,right=(a.length-1);
		
		while(left<=right)
		  {
		   int mid=left+(right-left)/2;
		   if(a[mid]==skey)
		   {
		   index=mid;
		   break;
		   }
		   if(a[mid]<skey)
		    {
			 left=mid+1;
			}
			else
			{
			right=mid-1;
			}
			}
			if(index != -1)
			 {
			  System.out.println("found");
			 }
			 else
			 {
			 System.out.println("Not found");
			 }
	}
}