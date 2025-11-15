//Write a program in java to find the majority element of an array
import java.util.*;
public class MajorityCount{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
	int a[]={4 , 8 , 4 , 6 , 4 , 4 , 4 , 4};
	int i,j,n,count=1,sum,temp;
	int flag=0;
	int size=a.length;
	System.out.println("Given array");
	for(i=0;i<size;i++){
		System.out.println(a[i]);
	}
    for(i=0;i<size;i++){
	  for(j=i+1;j<size;j++){
	    if(a[i] > a[j]){
		  temp=a[i];
		  a[i]=a[j];
		  a[j]=temp;
		}
	  }
    }
	 System.out.println("majority of element is : ");
	for(i=0 ;i<size; i++){
	  if(count>size/2){
	       System.out.println("majority "+a[i]);
		   flag=1;
		   break;
	  }else if(i == size-1){
	     break;
	  }else if(a[i] == a[i+1]){
	     count++;
	  }else{
	    count=1;
	  }
	}
	
	if(flag==0){
	System.out.print("no majority");
	}
	
  }//main
}//class

	