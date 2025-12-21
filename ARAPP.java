import java.util.*;
public class ARAPP
{ public static void main(String args[])
  {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of array :");
       int n=sc.nextInt();
       int a[]=new int[n];
       
       System.out.println("Enter the elements in array ");
       for(int i=0;i<n;i++)
       { a[i]=sc.nextInt();
       }
       for(int i=0;i<a.length;i++)
       { System.out.println(a[i]);
       }
       int max=Integer.MIN_VALUE;
       int smax=Integer.MIN_VALUE;
      for(int i=0;i<a.length;i++)
      { if(a[i] > max)
        {
          max=a[i];
        }
        
      }
      for(int i=0;i<a.length;i++)
      { if(a[i] > smax && max != a[i] )
        {
          smax=a[i];
        }
      } 
      
     System.out.println("Max element is "+max);
     System.out.println("Second max element is "+smax);
  }
}
