import java.util.*;
public class MissingEle{
	 public static void main(String args[]){
		 Scanner sc=new Scanner(System.in);
		 int a[]=new int[5];
		 System.out.print("Enter the element :\t");
		 for(int i=0;i<a.length;i++)
		 {
			 a[i]=sc.nextInt();
		 }
		 System.out.print("Array : \t");
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.print(a[i]);
		 }
		 System.out.print("\t Missing Element :");
		 for(int i=a[0],count=0;i<a.length-1;i++)
		 {
			  if(i !=a[count])
			 {
				 System.out.print("\t"+i);
			 }
			 else
			 {
				 count++;
			 }
		 }
	 }
}