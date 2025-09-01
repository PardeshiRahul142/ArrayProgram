//2.Write a program to reverse an array without using an extra array.
package Arr.gth;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		System.out.print("Original array is :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("Reverse array is :");
		for(int i=(arr.length-1);i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
