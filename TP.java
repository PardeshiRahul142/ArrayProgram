import java.util.*;
public class TP
{
   public static void main(String args[])
  {  
     int no=1;
     char ch='A';
     for(int i=1;i<=5;i++)
     {  ch='B';
       for(int j=1;j<=9;j++)
       {
           if(i<5 && ( j==6-i || j==4+i))
           {
             if(i%2==0)
             {
               System.out.print(ch);
                 ch++;
             }
            else
             {
               System.out.print(no);
                no++;
             }
           }
          else if(i==5 && (j%2!=0))
           {
            System.out.print(no);
              no++;
           }
          else
           {
              System.out.print("-");
           }
        }
      System.out.println();
     }
  }
}