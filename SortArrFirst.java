/*Input Array :  5732  8659  2534  9625  7354  1325
	
	Case 1 :  Sort Number In Ascending Order.
		Output :- 2357  5689  2345  2569  3457  1235 
*/
import java.util.*;
public class SortArrFirst
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
	 int b[]={5732 , 86597 , 2534 , 9625 , 7354 , 1325};
     
	 for(int i=0;i<b.length;i++)
	 { int num =b[i];
	   int digit[]= new int[4];
	 
	 for(int k=0;k<4;k++)
	 {  digit[k]=num%10;
        num = num / 10;	
     
	 }
	
	  for(int m=0;m<4;m++)
	  {  for(int n=m+1;n<4;n++)
		  {  if(digit[m] < digit[n])
			  {  int temp=digit[m];
		         digit[m]=digit[n];
				 digit[n]=temp;
	          }
		  }
	  }
	System.out.println("");
	for(int s=0;s <4;s++)
	{System.out.print(digit[s]);
	}
	 
	}
}
}	
		
      
  
