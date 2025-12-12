import java.util.*;
public class GARRAPP
{ public static void main(String args[])
  { 
    Scanner sc=new Scanner(System.in);
    int a[][]=new int[3][];
    for(int i=0;i<a.length;i++) 
    {
      System.out.println("Row is "+(i+1));
      int col=sc.nextInt();
      a[i]=new int[col];
    }
    
    for(int i=0;i<a.length;i++)
    {
      for(int j=0;j<a[i].length;j++)
      {
        a[i][j]=sc.nextInt();
      }
    System.out.println();
    }

   
    for(int i=0;i<a.length;i++)
    {
      for(int j=0;j<a[i].length;j++)
      {
        System.out.print(" "+a[i][j]);
      }
     System.out.println();
    }
 
  }//main
}//class