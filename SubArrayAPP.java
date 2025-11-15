/*9. Minimum Sum Subarray of Size K
Example:
 Input: arr = [2, 1, 5, 1, 3, 2], K=3
 Output: 4 (subarray [1, 3, 2])
*/

import java.util.*;
public class SubArrayAPP
{ public static void main(String args[])
  {  int arr[]={2,1,5,1,3,2};
     int k=3; 
     int sum=0;
     for(int i=0;i<k;i++)
     { sum=sum=arr[i];
     }
     System.out.println(""+sum);
     
     for(int i=k;i<=arr.length-1;i++)
     {  
       
       sum=sum+arr[i]-arr[i-k];
       System.out.println(sum+" "+i);
     }
         
  }
}