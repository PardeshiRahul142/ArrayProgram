import java.util.*;
public class Leader1
{  public static void main(String args[])
   {
     int a[]={ 15 , 18 , 5 , 7 , 9 , 2};
     int max=a.length-1;
         System.out.println("max"+a[max]);
     for(int i=a.length-2;i>=0;i--)
      {
         if(a[i]>max)
         {
           max=a[i];
            System.out.println(max);
         }
      }
   }
}//class