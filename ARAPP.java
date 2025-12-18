import java.util.*;
public class ARAPP
{
   public static void main(String args[])
   {
     Runnable ru=()->{
                 try{
                     for(int i=0;i<5;i++)
                     {
                      System.out.println("i"+i);
                      Thread.sleep(1000);
                     }
                    }//try
                   catch(InterruptedException e)
                   {
                    System.out.println(""+e);
                   }//catch
      
     };//anonymous class
    Thread t=new Thread(ru);
    t.start();
   }//main
}//class