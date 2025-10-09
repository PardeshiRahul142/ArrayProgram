import java.util.*;
public class PATApp
{  public static void main(String args[])
   {  int n=1;
      char ch='A';
     for(int i=1;i<=5;i++)
     {  for(int j=1;j<=9;j++)
        {  if(i%2!=0)
           {   
               if((j==6-i || j==i+4) && (i<5))
               {  System.out.print(n);
                 n++;
               }
               else if(i==5 && ( j%2!=0 ))
               {  System.out.print(n);
                  n++;
               }
               else
               {  System.out.print(" ");
               }
           }
           else
           {
             if((j==6-i || j==i+4) && (i<5))
           {  System.out.print(ch);
                 ch++;
           }
           else if(i==5 && ( j%2!=0 ))
           {  System.out.print(ch);
                  ch++;
           }
           else
           {  System.out.print(" ");
           }
           }
        }
       System.out.println();
     }
   }
}//class