//majority of element arraySize/2 < element count 
import java.util.*;
public class MajorityElement{
	public static void main(String args[]){
	int a[]={50,50,50,50,10,70,40,50,50,50};
	int i,j,temp;
	System.out.println("Given array");
	for(i=0;i<a.length;i++)
		{
		System.out.println(" "+a[i]);
		}
	for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				if(a[i] > a[j])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
			}
		}
	int count=1;
	int flag=0;
	for(i=0;i<a.length;i++)
		{
		    if(count > a.length/2)
				{
					System.out.println(a[i] +" majority element ");
					flag=1;
					break;
				}
			if(i==a.length-1)
				{
					break;
				}
		    else if(a[i] == a[i+1])
			    {
					count++;
				}
			else
			    {
					count=1;
				}
		}
		if(flag==0)
			{
				System.out.println("no majority found ");
			}
	}
}