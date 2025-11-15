import.java.util.*;
public class DuplicateElements
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	int a[]={12,12,43,22,12};
	int i,j,size=a.length;
	System.out.println("");
	for(i=0;i<size;i++)
	{
	    boolean flag=false;
		int count=1;
	   for(j=0;j<a.length;j++)
	   {
	     if(a[i] == a[j])
		 {
		   flag=true;
		   break;
		 }
		}
		  if(flag){
		    continue;
		  }
        for(int j=i+1;i<size-1;i++)
		{
		   if(a[i]==a[j])
		   {
		    count++;
		   }
		}
	if(flag)
	{
	 System.out.println(a[i]+"   "+count);
	}
	}
	}
	}
	
