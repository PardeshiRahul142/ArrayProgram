import java.util.*;
public class DuplicateRemoveEle
{
public static void main(String args[])
{
	int i,j;
	int a[]={1,12,2,4,5,2};
	System.out.println("sort array :");
	for(i=0;i<a.length;i++)
	{
		for(int j=i+1;i<a.length;i++)
		{
			if(a[i] > a[j])
			{
				int temp =a[i];
				    a[i]=a[j];
					a[j]=temp;
			}
		}
	}
	System.out.println("isplay :");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
}
}
					