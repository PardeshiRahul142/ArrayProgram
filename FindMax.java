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
     for(int i=0;i<a.length;i++)
     {  arr[i]=a[i];
     }
   }
   public void display()
   { for(int k=0;k<arr.length;k++)
     { System.out.print("\n"+arr[k]);
     }
   }
 
 public static void main(String args[])
 { Scanner sc=new Scanner(System.in);
   FindMax fm=new FindMax();
      System.out.println("Enter the size of array ");
      int size=sc.nextInt();

      for(int i=0;i<size;i++)
      {  ele[i]=sc.nextInt();
         fm.setArray(ele);
      }
      fm.display();
    
     

 
               
 }
}