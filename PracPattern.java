import java.util.*;
public class PracPattern
{
  public static void main(String args[])
  { 
   for(int i=1;i<5;i++)
   {  for(int j=1;j<i*2;j++)
      {  
       if(j%2==0)
       {
         System.out.print("#");
       }
      else{
         System.out.print(i);            
      }  
     }
     System.out.println(); 
   }
}
}