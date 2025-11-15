import java.util.*;
public class RotateArray1{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
	int a[]={0,3,6,9,12,14,18,20,22,25,27};
	int i,j,n;
	System.out.println("Enter the index : ");
	n=sc.nextInt();
	for(i=0;i<=n;i++){
	   int temp=a[0];
	   for(j=0;j<a.length-1;j++){
		    a[j]=a[j+1];
		}
		a[a.length-1]=temp;
	}
	System.out.println("Array " + n +"rotation");
	for(j=0;j<a.length;j++){
	  System.out.print(" "+a[j]);
	}
 }//main close.
}//class close.
	