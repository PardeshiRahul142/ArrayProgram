//3.Write a program to check if two arrays are equal (same elements in the same order).
package Arr.gth;
public class FrequencyOfNum {
    public static void main(String[] args) 
    {
		int a[]= {10,30,20,30,20};
        
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i] < a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		int count=1;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]== a[i+1])
			{
				count++;
			}
		  else
			{
				System.out.println(a[i]+" : times is :"+count);
				count=1;
			}
		}
		System.out.println(a[a.length-1] +" :times is :"+count);
	}

}
