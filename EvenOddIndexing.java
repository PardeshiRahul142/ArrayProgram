//5732  8659  2534  9625  7354  1325
/*
	Case 4 : Store the even number at the first and odd number at the last of digit at same index.
		Output :-  2573  6859  4253  2695  4735  2135
*/
import java.util.*;
public class EvenOddIndexing{
   public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     int a[]={5732 , 8659 , 2534 , 9625 , 7354 ,1325};
	 for(int i=0 ; i<a.length;i++)
	 {
	   int num=a[i];
	   int digit[]=new int[4];
	   int even=0;
	   int odd=1;
	   
	 for(int m=0;m<4;m++)
	 {
	   digit[m]=num % 10;
	   num = num / 10;
	 }
	 
	 for(int m=0;m<4;m++)
	 {
	  if(digit[m] % 2 ==0)
	  {
	    System.out.print(digit[m]);
	  }
	 }
	 
	  for(int m=0;m<4;m++)
	  {
	  if(digit[m] % 2 != 0)
	  {
	    System.out.print(digit[m]);
	  }
	  }
	    System.out.println("");
  }
} 
}