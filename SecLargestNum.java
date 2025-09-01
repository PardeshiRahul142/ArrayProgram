//1.Write a program to find the second largest element in an array.
package Arr.gth;

public class SecLargestNum {

	public static void main(String[] args) {
		
		int arr[]= {10,30,402,40,50};
		int max=0;
		int smax=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > max)
			{
				max=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > smax && arr[i]!=max)
			{
				smax=arr[i];
			}
		}
		System.out.println("Second max element is :"+smax);

	}

}
