//Q.4 Write ajava program to take 5 elements and display elements which are multiple of 5.
import java.util.*;
public class MultipleOfFive
{
  public static void main(String args[])
  { 
    int[]a=new int[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the element ");
    for(int i=0;i<a.length ;i++)
     {
      a[i]=sc.nextInt();
     }
     for(int i=0;i<a.length;i++)
      {
       if(a[i] % 5==0)
        {
          System.out.println("number is divisiable : "+a[i]);
        }
      }
   }
}   
	 
