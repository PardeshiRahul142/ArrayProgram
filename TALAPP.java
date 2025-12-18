import java.util.*;
public class TALAPP
{
   public static void main(String args[])
   {
      new Thread(()->{
           
           try
           {
             for(int i=0;i<5;i++)
             {
               System.out.println("I"+i);
               Thread.sleep(1000);
              }
           }
          catch(InterruptedException e)
          { 
            System.out.println(""+e);
          }
        
      }).start();
   }
}