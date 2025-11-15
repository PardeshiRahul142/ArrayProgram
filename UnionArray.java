import java.util.*;
public class UnionArray
{
  public static void main(String args[])
  {
    int a[]={1,2,3};
	int b[]={2,3,4,5};
	int c[]={2,4,5,9};
	boolean flag[]=new boolean[100];
	
	for(int i=0 ;i<a.length;i++)
	  {
		if(!flag[a[i]])
		{
		   System.out.println(a[i]+" ");
		   flag[a[i]]=true;
		}
	  }
	  for(int i=0;i<b.length;i++)
	    {
		   if(!flag[b[i]])
		     {
			   System.out.println(b[i]+" ");
			   flag[b[i]]=true;
			 }
		}
		for(int i=0;i<c.length;i++)
		   {
			   if(!flag[c[i]])
			     {
					 System.out.println(c[i]+" ");
					 flag[c[i]]=true;
				 }
		   }
	}
}
