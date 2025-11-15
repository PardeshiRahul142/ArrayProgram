// Write a program in java to rotate an array by N positions ?
import java.util.*;
public class RotateArray{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
	int a[]={10,30,20,40,50};
	int i,k,n,temp;
	int size=a.length;
	System.out.println("Enter the index");
	n=sc.nextInt();
	for(k=0;k<n;k++){
	  temp=a[0];
	  for(i=0;i<size-1;i++){
	     a[i]=a[i+1];
	  }
		a[a.length-1]=temp;
	}  
	System.out.println("After rotation array ");
	for(i=0;i<a.length;i++){
	System.out.println(" "+a[i]);
	}
	}
	}