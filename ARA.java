/*Q2. Rearrange the array so that even and odd numbers alternate. Assume the number of even and odd
elements is equal.
Input :- arr = [1, 2, 3, 4, 5, 6]
Output :- [2, 1, 4, 3, 6, 5]*/

import java.util.*;
public class ARA
{ public static void main(String args[])
  {
     int a[]={1,2,3,4,5,6};
     int j=0;
     int o=0;
     int eve[]=new int[3];
     int odd[]=new int[3];
     int ad[]=new int[a.length];
     for(int i=0;i<a.length;i++)
     {
       if(a[i] % 2==0)
       {
          eve[j]=a[i];
               j++;
       } 
        if(a[i] %2 !=0)
        {
           odd[o]=a[i];
           o++;
        }
     }
     
      int e=0,i=0,od=0;
       

    while(e<eve.length && od<odd.length )
    {
       ad[i++]=eve[e++];
       ad[i++]=odd[od++];     
    }
    for(i=0;i<ad.length;i++)
    { System.out.print(" "+ad[i]);
    }
  }
}