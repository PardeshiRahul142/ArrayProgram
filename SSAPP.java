import java.util.*;
class TicketGenerator
{
 private static int ticketNum=0;

  public static synchronized int getNextTicket()
  {
    ++ticketNum;
     try{
          Thread.sleep(1000);
     }catch(Exception e){
      System.out.println(e);
     }
     return ticketNum;
  }
}
class CounterThread extends Thread
{
   private String customerName;

   CounterThread(String customerName)
   {
      this.customerName=customerName;
   }

   public void run()
   {
      int ticket=TicketGenerator.getNextTicket();
      System.out.println("Customer Name is :"+customerName+"Ticket No :"+ticket);
   } 
}
public class SSAPP
{
   public static void main(String args[])
   {
    CounterThread t=new CounterThread("Rahul");
                  t.start();
    
     CounterThread t1=new CounterThread("Yuvraj");
                  t1.start();

          CounterThread t3=new CounterThread("Shree");
                  t3.start();
 
   }
}