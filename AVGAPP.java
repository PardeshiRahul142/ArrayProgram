import java.util.*;
public class AVGAPP
{  
   public static void main(String args[])
   {
      int a[]={1,3,2,6,-1,4,1,8,2};
      float sum=0;
       float avg=0;
      int k=5;
      for(int i=0;i<k;i++)
      { 
        sum=sum+a[i];
      }
       avg=sum/5;
       System.out.println(avg);

      for(int i=k;i<a.length;i++)
      {   sum-=a[i-k];
          sum+=a[i];
         
          avg=sum/5;
          System.out.println(avg);
      }
     
   }
}//class