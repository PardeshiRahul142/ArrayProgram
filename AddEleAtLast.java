/*Example 1: 
Input: digits = [1,2,3]    
Output: [1,2,4] 
Explanation: The array represents the integer 123. 
Incrementing by one gives 123 + 1 = 124. 
Thus, the result should be [1,2,4]. 
*/
import java.util.*;
public class AddEleAtLast
{
  public static void main(String args[])
  {
    int a[]={1,2,3};
	for(int i=0 ; i<a.length;i++)
	{
	  int num=a[i];
	  int digit[]=new int[3];
	  int temp=num;
	  for(int j=0 ; j<3 ; j++)
	  {
	   digit[j]=num % 10 ;
	    num=num/10;
	  }
	  
	 num=temp;
	 System.out.println(num+1);
	}
  }
}
	   
	   