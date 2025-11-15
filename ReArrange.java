/*8. Rearrange Array in Alternate Positive and Negative Items
Concept: Use auxiliary arrays or index manipulation to interleave.
 Use Case: Alternate scheduling, balancing data flow.
Input: arr = [2, 3, -4, -1, 6, -9]
 
Separate positives: [2, 3, 6]
Separate negatives: [-4, -1, -9]
Rearranged array: [2, -4, 3, -1, 6, -9]
*/
import java.util.*;
public class ReArrange
{ public static void main(String args[])
  {  int arr[]={2,3,-4,-1,6,-9};
     int k=0;
     int neg[]=new int[arr.length];
     int p=0;
     int pos[]=new int[arr.length];

    for(int i=0;i<arr.length;i++)
    { if(arr[i]>0)
      { pos[p++]=arr[i];
      }
      else
      { neg[k++]=arr[i];
      }
    }
     System.out.println("Positive number :");
     for(int i=0;i<p;i++)
     { System.out.println(pos[i]+"\t");
     }
     System.out.println("Negative number :");
     for(int i=0;i<k;i++)
     { System.out.println(neg[i]);
     }
       
      System.out.println("After merge :");
      int i=0;
      while(i<k)
      { System.out.print(pos[i]+" ");
        System.out.print(neg[i]+" ");
          i++;
      }
  }
}