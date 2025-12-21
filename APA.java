import java.util.*;
public class APA
{ public static void main(String args[])
  {
     int num=1;
     for(int i=0;i<5;i++)
     {
       if(i<3)
       {
         for(int j=0;j<=i*2;j++)
         {  
            System.out.print(num);
         }
           num+=2;
       }
      else
       {
          int no=3;
         for(int j=0;j<3;j++)
         {
           if(i==3 && j<=5-i)
           {
             System.out.print(no);
           }
           if(i==4 && j<5-i)
           {
              System.out.print(no);
           }
         }
           no-=2;
           
       }
      System.out.println();
     }
  }
}