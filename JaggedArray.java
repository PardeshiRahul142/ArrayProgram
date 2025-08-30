package Arr.gth;
import java.util.*;
public class JaggedArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][];
		   a[0]=new int[2];
		   a[1]=new int[5];
		   a[2]=new int[3];
		   
		   System.out.println("Enter the element :");
		   for(int i=0;i<a.length;i++)
		   {
			   for(int j=0;j<a[i].length;j++)
			   {
				   a[i][j]=sc.nextInt();
			   }
		   }
		   System.out.println("Array is : ");
		   for(int i=0;i<a.length;i++)
		   {
			   for(int j=0;j<a[i].length;j++)
			   {
				   System.out.print(" "+a[i][j]);
			   }
			   System.out.println();
		   }
			   
		   
		   

	}

}
