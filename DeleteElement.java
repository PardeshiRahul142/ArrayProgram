//Delete element in Array
import java.util.*;
public class DeleteElement{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int a[]= new int[5];
	int i;
	
	
	System.out.print("Enter the array element :");
	for(i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.print("Given array : ");
	for( i=0;i<a.length;i++)
	{
		System.out.print(a[i]);
	}
	System.out.print(" enter the index :");
	int n=sc.nextInt();
	if(n<0 &&  n>a.length)
	{
		System.out.print("invalid");
	}
	else
	{
		for(i=n ; i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
	}
	System.out.println("After deleation element  :");
	for(i=0;i<a.length-1;i++)
	{
		System.out.print(a[i]);
	}
	
  }//main
}//class
	