import java.util.*;
public class MatrixSum{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
	int i,j;
	int a[][]= new int[3][3];
	System.out.println("Enter the element ");
	for(i=0;i<a.length;i++){
	  for(j=0;j<a.length;j++){
	      a[i][j]=sc.nextInt();
	  }
	}
	  System.out.println("Display array :");
	  for(i=0;i<a.length;i++){
	    for(j=0;j<a.length;j++){
	      System.out.print(" "+a[i][j]);
	    }
		System.out.println();
	  }
	    int sum=0;
	   for(i=0;i<a.length;i++){
		 
	    for(j=0;j<a.length;j++){
	      //sum=sum+a[i][j];
	    }
		System.out.println(sum);
	  }
	}
}