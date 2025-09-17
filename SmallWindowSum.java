/*Q4. Problem: 
Given an array of positive integers and a target sum S, find the length of the smallest contiguous subarray whose sum is greater than or equal to S. If no such subarray exists, return 0. 
Example: 
Input: arr = [2,3,1,2,4,3], S = 7 Output: 2 (subarray [4,3]). 
Explanation: 
Expand window until the sum ≥ S. Then shrink from the left while maintaining the condition to minimize length. 
*/
import java.util.*;
public class SmallWindowSum
{  public static void main(String args[])
   {
     int a[]={2,3,1,2,4,3};
     int target=7;
      int window=0;
      int last=0;
      int first=0;
     int max=Integer.MAX_VALUE;
     for(int left=0 ; left<a.length;left++)
     {  int current_sum=0;
        int count=0;
       
       
        for(int right=left;right<a.length;right++)
        {
            current_sum+=a[right];
          if(current_sum == target)
          {
             count=right+1-left;
             last=right;
             window++;
             break;
           }
           if(current_sum > target)
            {
                break;
            }
           if(count < max) 
            {
              max=count;
              first=a[4];
             
            }
        }//right
      }//left;
      System.out.println(window);
               System.out.print("{");
      System.out.print(a[first]+","+a[last]);
      System.out.print("}");
 
  }//main
}//class