/*Q5. Write program to create class name as MergeTwoArray with parameterized constructor
      MergeTwoArray(int [],int []): this constructor accept two array as parameter
      int [] getMergeArray(): this function merge two array in third array and return new merged    array
*/

import java.util.*;
class MergeArray
{ int arr[];
  int brr[];
  int c[];
  
  MergeArray(int a[] , int b[])
  { this.arr=a;
    this.brr=b;
    c =new int[arr.length + brr.length];
  }
 
  public int []getMergeArray()
  { 
    int k=0;
    for(int i=0;i<arr.length;i++)
    { c[k++]=arr[i];    
    }
    for(int i=0;i<brr.length;i++)
    { c[k++]=brr[i];  
    }
    return c;
  }
  
  public void display()
  { for(int i=0;i<c.length;i++)
    { System.out.print("\t"+c[i]);
    }
  } 
  
}
public class MergeArrayAPP
{ public static void main(String args[])
  { Scanner sc=new Scanner(System.in);
    

    System.out.println("Enter the size of 1 array");
    int size=sc.nextInt(); 
    int arr1[]=new int[size];
    System.out.println("Enter the array elements :");
    for(int i=0;i<arr1.length;i++)
    {  arr1[i]=sc.nextInt();
    }

    

    System.out.println("Enter the size of 2 array");
    int size2=sc.nextInt(); 
    int arr2[]=new int[size2];
    System.out.println("Enter the array elements :");
    for(int i=0;i<arr2.length;i++)
    {  arr2[i]=sc.nextInt();
    }



    MergeArray ma=new MergeArray(arr1 , arr2);
               ma.getMergeArray();
               ma.display();

    
    
  }
}