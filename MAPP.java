/*7.Find Majority Element (Occurs > n/2 Times)
Concept: Use count method or Boyer-Moore Voting Algorithm.
 Use Case: Identify the dominating product, preference, etc.
Inut : arr = [2, 2, 1, 1, 2, 2, 2]
Size (n) = 7
Majority element is: 2
*/

import java.util.*;
public class MAPP
{ public static void main(String args[])
  { int a[]={2,2,1,1,2,2,2};
      
     for(int i=0;i<a.length;i++) 
     { for(int j=i+1;j<a.length;j++)
       { if(a[i] > a[j])
         {  int temp=a[i];
                  a[i]=a[j];
                  a[j]=temp;
         }
       }
     }
     int count=1;
     int n=7;
    for(int i=0;i<a.length-1;i++)
    { 
      if(count>a.length/2)
      {  System.out.println("Marjrity element"+a[count]);
          break;
      }
      else if(a[i]==a[i+1])
      { count++;
      }
      else
      { 
        count=1;
      }
    }
 
  }
}