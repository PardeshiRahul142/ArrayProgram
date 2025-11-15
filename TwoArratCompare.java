//Q10. Write a java program to find common elements between two arrays.

import java.util.*;
public class TwoArratCompare{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
	int a[] = { 10,30, 40 ,50 };
	int b[] = {10,40,20};
    System.out.println("common elements :");
	 for( i=0; i<a.length;i++){   
	   for(j=0;j<b.length;j++){
	     if(a[i] == b[j]){  
			System.out.println(" common"+a[i]);
           }
		}// j close
	 }// i close
   }//main method
}//class close