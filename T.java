import java.util.*;
import java.lang.*;
class T1 extends Thread
{
  public void run()
     {
        
    try{
          for(int i=0;i<5;i++)
          { 
             System.out.println("i :"+ i);
             sleep(2000);
          }
       }
    catch(Exception e)
     { System.out.println(e);
     }

     }
}
class T2 extends Thread
{
  public void run()
     {
        
    try{
          for(int i=0;i<50;i++)
          { 
           System.out.println("I :"+i);  
            Thread.sleep(1000);
          }
       }
    catch(Exception e)
     {
        System.out.println(e);
     }

     }
}
public class T
{
   public static void main(String args[]) throws Exception
   {
      T1 ta=new T1();
      ta.start();
      ta.join();

       T2 t2=new T2();
        t2.start();
    
   }
}