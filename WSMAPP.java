import java.util.*;
class Table
{
   public synchronized void showTable(int x)
   {
      try
      {
            for(int i=1;i<=10;i++)
            { 
               System.out.println(i+" "+x+" "+(i*x));
               if(i==5)
               { 
                 System.out.println("I am in waiting state");
                 wait(5000);
               }
              Thread.sleep(1000);
    
            }
      }
      catch(InterruptedException e)
      {
         System.out.println(e);
      }
   }
 
  public synchronized void recallThread()
  {
  
          try{ notify() }
          catch(InterruptedException e){System.out.println(e);}
  }
}
class Two extends Thread
{
   Table t;
   Two(Table t){this.t=t;}
   
    public void run()
    {
     t.showTable(3);
    }
}
class Three extends Thread
{
  Table ta;
  Three(Table ta){ this.ta=ta;}

   public void run()
   {
     ta.showTable(3);
   }
}
public class WSMAPP
{
   public static void main(String args[])
   {
      Table t=new Table();
 
     Two to=new Two(t);
        to.start();

     Three th=new Three(t);
       th.start();
   }
}