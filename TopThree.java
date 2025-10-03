/*Sample Input: [78, 90, 90, 86, 85, 92, 70, 92]
Expected Output: 92, 90, 86*/

import java.util.*;
public class TopThree
{   public static void main(String args[])
    {
      int a[]={78, 90, 90, 86, 85, 92, 70, 92};
      System.out.println("Top three is :");
       System.out.println();
       int max=0;
       int smax=0;  
       int tmax=0;
       for(int i=0;i<a.length;i++)
       {
         if(a[i] > max)
         {max=a[i];
         }
        }
       for(int i=0;i<a.length;i++)
       {
         if(a[i] > smax && a[i]!=max)
         {smax=a[i];
         }
       }
       for(int i=0;i<a.length;i++)
       {
         if(a[i] > tmax && a[i] !=smax && a[i] !=max)
         {tmax=a[i];
         }
       }
       System.out.println("Max :"+max);
       System.out.println("Smax :"+smax);
       System.out.println("Tmax :"+tmax);
    }
}//class