import java.util.*;
public class ApearsElementInArray{
  public static void main(String args[]){
    int a[]={1,3,4,53,3,4};
	int i,j;
	System.out.println("Given array  :");
	for( i=0;i<a.length;i++){
	 System.out.print(a[i]);
	 }
	 System.out.println("Frequency count ");
	 for( i=0;i<a.length;i++){
	  boolean flag=false;
	   for(j=0;j<i;j++){
	   if(a[i]==a[j]){
	     flag=true;
		 break;
	   }
	   }
	   if(flag){
	   continue;
	   
	   }
	  int count=1;
	  for(j=i+1;j<a.length;j++){
	  if(a[i]==a[j]){
	  count++;
	  }
	  }
	  System.out.println(a[i] +" apears " + count );
	  }
	 
	 }//main
	 }//class