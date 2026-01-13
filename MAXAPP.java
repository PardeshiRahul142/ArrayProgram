import java.util.*;
public class MAXAPP
{  public static void main(String args[])
   {
      int a[]={1,3,-1,-3,5,3,6,7};
      int k=3;
      for(int i=0;i<a.length-2;i++)
      {  
         int max=0;
          for(int j=i;j<k;j++)
          {
          // System.out.println(i+" "+j);
            if(a[j]>max)
            {
              max=a[j];
            }
          }
             if(k<a.length)
             {
                 k++;
             }
           System.out.print(max+" ");
      }
   }  
}