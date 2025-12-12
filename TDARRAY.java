import java.util.*;
public class TDARRAY
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     int a[][]=new int[3][3];
     System.out.println("Enter the value in array");
     for(int i=0;i<a.length;i++)
     {
       for(int j=0;j<a[i].length;j++)
       {
          a[i][j]=sc.nextInt();
       }
     }
    int sum=0;
    System.out.println("Array is ");
    for(int i=0;i<a.length;i++)
    {  
       for(int j=0;j<a[i].length;j++)
       {
            if(j==2-i)
            {
               sum+=a[i][j];
               System.out.println(a[i][j]);
            }
       }    
    }
      System.out.println(sum);
  }
}