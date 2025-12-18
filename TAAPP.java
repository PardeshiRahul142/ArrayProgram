import java.util.*;
public class TAAPP
{
   public static void main(String args[])
   {
      Thread t=new Thread(){
       public void run()
       {
          try{
                for(int i=0 ; i<5 ; i++)
                {
                  System.out.println("I  "+i);
                  Thread.sleep(1000);
                }
          }//try
          catch(InterruptedException e)
          {
             System.out.println(e);
          }
       }//run
      
      };//annonomus
     t.start();
  }
}