import java.util.*;
public class ArrayMethod{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
	int arr[]=new int[5];
	System.out.println("Enter the element in array :");
	for(int i=0;i<arr.length;i++)
	   {
	    arr[i]=sc.nextInt();
	   }
	   int res=getArray(arr);
	   System.out.print("array is :"+res);
 }
	 public static int getArray(int s[])
	 {
	 int mark=0;
	 for(int i=0;i<s.length;i++)
	 {
	   mark=mark+s[i];
	 }
     return mark/s.length;
	}
}