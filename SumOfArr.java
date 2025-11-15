/*		
	Case 3 : Store sum of digits at same index.
		Output :-  17  28  14  22  19  11
		*/
import java.util.*;
public class SumOfArr
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   int a[]={5732 , 8659 , 2534 , 9625 , 7354 , 1325};
   for(int i=0;i<a.length;i++)
   {
     int num=a[i];
	 int digit[]=new int[4];
	 int sum=0;
	 for(int k=0;k<4;k++)
	 {
	  digit[k]=num % 10;
	  num = num /10;
	 }
	 for(int j=0;j<4;j++)
	 {
	  sum=sum+digit[j];
	 }
	 System.out.println(sum);
	}
  }
}