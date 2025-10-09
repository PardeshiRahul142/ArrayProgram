//Input array elements: 1, 2, 3, 5, 1, 5, 20, 2, 12, 10
//All unique elements in the array are: 3, 20, 12, 10


import java.util.*;
public class UniqueArray
{  public static void main(String args[])
   { 
    int a[]={1,2,2,5,1,5,20,2,12,10};
    int b[]=new int[a.length];
    int size=a.length;
    int ind=0;
   for(int i=0;i<a.length;i++)
   { for(int j=i+1;j<a.length;j++)
     { if(a[i] == a[j])
        {
         boolean already =false;
         for(int k=0;k<ind;k++)
         {  if(a[k]==a[i])
            { already=true;
              break;
            }
         }
        
       if(!already)
       { a[ind]=a[j];
          ind++;
       }
      }
     }
   }
   for(int i=0;i<ind;i++)
   { System.out.print(" "+a[i]);
   }

   }//main
}//class