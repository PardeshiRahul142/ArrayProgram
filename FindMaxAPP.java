/*Q3. Write program to create class name as FindMax with two functions
       void setArray(int a[]): this function is used for accept array as parameter
       int getMax(): this function can find the max value from array and return it.
*/
import java.util.*;
public class FindMaxAPP
{ 
   int arr[];
   public void setArray(int a[])
   {
      arr=a; 
   }
   public void display()
   { for(int k=0;k<arr.length;k++)
     { System.out.print("\n"+arr[k]);
     }
   }
   public void maxEle()
   { int max=0;
     for(int i=0;i<arr.length;i++)
     { if(arr[i]>max)
       { max=arr[i];
       }
     }
     System.out.println("Max element is :"+max);
   }
 
 public static void main(String args[])
 { Scanner sc=new Scanner(System.in);
   FindMaxAPP fm=new FindMaxAPP();
      System.out.println("Enter the size of array ");
      int size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("Enter the elements :");
      for(int i=0;i<size;i++)
      { a[i]=sc.nextInt();
      }
     
      fm.setArray(a);
      System.out.println("Elements is :");
      fm.display(); 
      System.out.println();  
      fm.maxEle()
 }
}