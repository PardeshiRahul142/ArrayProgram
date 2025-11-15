import java.util.*;
public class InsElement{
  public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
	int a[]=new int[6];
	System.out.println("Enter the element in array : ");
	for(int i=0 ; i<a.length-1;i++)
	   {
	      a[i]=sc.nextInt();
	   }
	System.out.println("Given array is : ");
	for(int i=0;i<a.length;i++)
	   {
	      System.out.println(i + " ---> " + a[i]);
	   }
	   System.out.println(a.length);
	System.out.println("Enter the index : ");
	int ind=sc.nextInt();
	System.out.println("Enter the element : ");
	int value=sc.nextInt();
	
	for(int i=(a.length - 2 ) ; i>=ind;i--)
	   {
	     a[i+1]=a[i];
		 System.out.println(" a[i+1]=a[i];"+a[i+1] +"  "+a[i]);
	   }
	   a[ind]=value;
	System.out.println("after the insert element in array : ");
	for(int i=0;i<a.length;i++)
	   {
	      System.out.println(i +" ---> " + a[i]);
	   }
	}
}