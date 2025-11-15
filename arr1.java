import java.util.*;
public class arr1
{arr1
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int[] a = new int[5];
		System.out.println("Enter the element in array : ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("display array : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(i + "---->" + a[i]);
		}
	}
}