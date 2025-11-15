import java.util.*;
public class NOPattern
{
  public static void main(String args[])
  { 
   for(int i=1;i<5;i++)
   {  for(int j=1;j<i*2;j++)
      {  
       if(j%2==0)
       {
         System.out.print("*");
       }
      else{
         System.out.print(i);            
      }  
     }
     System.out.println(); 
   }

  for(int i=4;i>=1;i--)
   {  for(int j=1;j<i*2;j++)
      {  
       if(j%2==0)
       {
         System.out.print("*");
       }
      else{
         System.out.print(i);            
      }  
     }
     System.out.println(); 
   }

  }//main
}//class