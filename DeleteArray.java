//Write a program in java to delete an element at desired position from an array.
import java.util.*;
public class DeleteArray{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
	int i,j,n;
	int a[]=new int[5];
	int size=a.length;
	System.out.println("Enter the array element :");
	for(i=0;i<a.length;i++){
		a[i]=sc.nextInt();
	}
	 System.out.println("sort array :");
	 for(i=0;i<a.length;i++){
	    for(j=i+1;j<a.length;j++){
		   if(a[i] > a[j]){
		     int temp=a[i];
			     a[i]=a[j];
				 a[j]=temp;
			}// if
		}// j loop
		System.out.println(a[i]);
	 }//i loop
	  System.out.println("Enter the index  : ");
	  n=sc.nextInt();
	  if(n<0 || n>=size)
	  {
		  System.out.println("invalid");
	  }else{
		  for(i=n ; i<size-1; i++){
		  a[i]=a[i+1];
		  }
	  }
	  System.out.println("after delete element : ");
	  for(i=0;i<size-1;i++){
		  System.out.println(a[i]);
	  }
	  
	
  }//main method close
}//class close 