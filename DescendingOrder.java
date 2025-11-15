//Input Array :  5732  8659  2534  9625  7354  1325

//Case 2 : Sort Number In Descending Order.
//Output :- 7532  9865  5432  9652  7543  5321

import java.util.*;
public class DescendingOrder{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  int a[]={5732 , 8659 , 2534 , 9625 , 7354 , 1325};
  
  for(int i=0;i<a.length;i++)
  {
    int num=a[i];
	int digit[]=new int[4];
	
	for(int j=0;j<4;j++)
	{
	  digit[j]=num %10;
	  num=num/10;
	
	}
	
	for(int m=0;m<4;m++)
	{
	 for(int n=m+1;n<4;n++)
	 {  
	     if(digit[m]>digit[n])
		 {
		    int temp=digit[m];
			digit[m]=digit[n];
			digit[n]=temp;
		 }
	 }
	}
	System.out.println("");
	for(int k=0;k<4;k++)
    {
	   System.out.print(""+digit[k]);
    }
   }
 }
}






 	