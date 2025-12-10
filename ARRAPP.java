/*Q2. create class name as ArrayOperation with function name as setArray() and create its Two
child classes name as Unique , MergeArray. We need to inherit the ArrayOperation class in
Unique , MergeArray and create function and write the logic.
1. Unique Class : - Input array elements: 1, 2, 3, 5, 1, 5, 20, 2, 12, 10
Output : All unique elements in the array are: 3, 20, 12, 10
2. MergeArray class :- Input -First Array :- 1 2 3 4 5
Second Array :- 6 7 8 9 10
Output - 1 10 2 9 3 8 4 7 5 6
*/

import java.util.*;
class ArrayOperation
{
   int array[];
   int f[];
   int s[];
   void arraySet(int a[],int f[],int s[])
   {
     this.array=a;
     this.f=f;
     this.s=s;
   }
}

class Unique extends ArrayOperation
{ 
   
    public void Uniq(int array[])
    {
      // 1, 2, 3, 5, 1, 5, 20, 2, 12, 10
      int unique[]=new int[array.length];
      int k=0;
      for(int i=0;i<array.length;i++)
      {
        int cur=array[i];
        boolean found=false;

        for(int j=0;j<unique.length;j++)
        {
          if(unique[j] == cur)
          {
             found=true;
             break;
          }
        }
         if(!found)
         {
           unique[k]=cur;
               k++;
         }
      }
     System.out.println("Unique elements is :");
       for(int i=0;i<k;i++)
       {
           System.out.print(unique[i]+" ");
       }
   
    }
   
}
class MergeArray extends ArrayOperation
{
     public void merged(int f[],int s[] )
    {
       int startf=0;
       int endf=f.length-1;
 
       int ends=s.length-1;
       int starts=0;
      System.out.println("Merged array :");
      while(startf<endf && ends>starts)
      {
          System.out.print(f[startf]+" "+s[ends]+" ");
          startf++;
          ends--;
      }
    }
}

public class ARRAPP
{
  public static void main(String args[])
  {
      int arr[]={1,2,3,5,1,20,2,12,10};
      int first[]={1 ,2 ,3 ,4 ,5};
      int second[]={ 6 , 7 ,8 ,9 , 10};
      
      Unique u=new Unique();
        u.Uniq(arr);

     MergeArray m=new MergeArray();
    m.merged(first,second);

  }
}