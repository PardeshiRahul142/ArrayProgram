import java.util.*;
public class DuplicateRemoveEle
{
public static void main(String args[])
{
	int i,j;
	int a[]={1,12,2,4,5,2};
	int k[]=new int[a.length];
	int size=a.length;
	System.out.println("sort array :");
	for(i=0;i<size;i++)
	{
		for(j=i+1;j<size;j++)
		{
			if(a[i] > a[j])
			{
				int temp =a[i];
				    a[i]=a[j];
					a[j]=temp;
			}
		}
	}
	System.out.println("Sorted array  :");
	for(i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	
    for(i=0;i<size;i++)
	{
		for(j=i+1;j<size-1;j++)
		{
			if(a[i] == a[j])
			{
				for(i=0;i<size;i++)
				{
					k[i]=a[i];
				}
			}
		}
	}
	System.out.println("Duplicate");
	for(i=0;i<size;i++)
	{
		System.out.println(a[i]);
	}
	
}
}
					