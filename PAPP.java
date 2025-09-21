import java.util.*;
public class PAPP
{ public static void main(String args[])
  {
   for(int i=0 ;i<5;i++)
   { int n=1;
     char ch='A';
     for(int j=0;j<9;j++)
     { 
      if((i==0 && j>=8)||(i==1 && j>=6) || (i==2 && j>=4) || (i==3 && j>=2) || (i==4 && j<=9))
      {
        if(i%2==0)
        { 
          if((i==2 && j<i+4) || (i==4 && j<i))
          {System.out.print(((char)ch));
            ch++;
          }
          else
          {System.out.print(((char)ch));
            ch--;
          }
        }
       else
        { 
          if((i==1&& j<=i+5) || (i==3 && j<=i+1))
          {
          System.out.print(n);
            n++;
          }
         else
          {
            System.out.print(n);
              n--;
           }
        
        }    
       
     }
      else
       { System.out.print("-");
       }
     }
      System.out.println();
  
   } 
  }
}