//Input array elements: 1, 2, 3, 5, 1, 5, 20, 2, 12, 10
//All unique elements in the array are: 3, 20, 12, 10

import java.util.*;
public class UEAPP
{ public static void main(String args[])
  {
     int a[]={ 1, 2, 3, 5, 1, 5, 20, 2, 12, 10};
     int b[]=new int[a.length];
     
     int size=a.length;
     
    for(int i=0;i<a.length;i++)     
     { 
        int count=0;
        for(int j=0;j<a.length;j++)
       { if(a[i]==a[j])
         { count++;
         }
       }
      if(count==1)
      { System.out.print(a[i]+" ");
      }
     }
 
   }//main
}//class