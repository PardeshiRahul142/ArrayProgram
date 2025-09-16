//two pointer find the sum is of two element 

import java.util.*;
public class TwoPointer
{  public static void main(String args[])
   {
      int a[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
     int target=19;
     int left=0;
     int right=a.length-1;
     int sum=0;
    while(left < right)
    {
      int current_sum=a[left] + a[right];
     if(current_sum==target)
     {  System.out.println(a[left] + " " +a[right]);
        break;
     }
    else if(current_sum < target )
     {
        left++;
     }
    else
     {
        right--;
     } 
 

    }//while
   }//main method
}//class