//merge array 
import java.util.*;
public class MergeArray1
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int a[]=new int[5];
   int b[]=new int [5];
  int c[]=new int[a.length + b.length];
  
  System.out.println("Enter the first array ");
  for(int i=0;i<a.length;i++) 
  {
  a[i]=sc.nextInt();
  }
  System.out.println("Enter the second array");
  for(int i=0; i<b.length;i++)
  {
  b[i]=sc.nextInt();
  }
  for(int i=0,k=(a.length);i<(a.length);i++)
  {
	  c[i]=a[i];
	  if(k<c.length)
	  {
	  c[k]=b[i];
	  k++;
      }
  }
  
  System.out.println("Display first array ");
  for(int i=0 ; i<a.length;i++)
  {
	  System.out.println(i+"---->"+a[i]);
  }
  System.out.println("Display second array :");
  for(int i=0;i<b.length;i++)
  {
	  System.out.println(i +"---->"+b[i]);
  }
  System.out.println("Display merge array ");
  for(int i=0; i<c.length ;i++)
  {
	  System.out.println(i+"---->"+c[i]);
  }
 }
}
 
  