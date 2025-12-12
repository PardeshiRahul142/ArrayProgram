import java.util.*;
public class OPTAPP
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
  
      int a[][]=new int[][]{
                         {1,2,3},
                         {4,5,6},
                         {7,8,9}
                       };
    
      for(int i=0;i<a.length;i++)
      {   int max=Integer.MAX_VALUE;
         for(int j=0;j<a[i].length;j++)
         {
            if(a[i][j] < max)
            {
              max=a[i][j];
            }
         }
        System.out.println(max);
      }
   }
}