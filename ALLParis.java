/*6.Find All Pairs with Given Sum
Concept: Use nested loops or two-pointer technique to check sums.
 Use Case: Match contributors, tasks, etc., that add up to a budget.
arr = [1, 5, 7, -1, 5]
Target sum (S) = 6
Example: Pairs with sum 6:
(5, 1)
(-1,7)
(5,1)
*/

import java.util.*;
class ALLParis
{ public static void main(String args[])
  {
    int a[]={1,5,7,-1,5};
    int s=6;
    int k=2;
    int sum=0;
    for(int i=a.length-1;i>0;i--)
    {  
       for(int j=i-1;j>=0;j--)
       { 
         if(a[i] + a[j] == s)
         { 
           System.out.println("(" + a[i] + "," + a[j] +")");
         }
       }
    } 
  
 }
}