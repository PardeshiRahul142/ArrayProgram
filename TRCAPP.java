import java.util.*;
class Table
{
   synchronized public void printTable(int n)
   {
      for(int i=0;i<5;i++)
      { System.out.println(" "+n*i);
      } 
   }
}

class Th1 extends Thread
{
  Table t;
   Th1(Table t)
  {
     this.t=t;
  }
  
  public void run()
  { 
      t.printTable(5);
  }
}
class Th2 extends Thread
{
  Table t;
   Th2(Table t)
  {
     this.t=t;
  }
  public void run()
  { 
      t.printTable(10);
  }
}
public class TRCAPP
{
  public static void main(String args[])
  {
   Table t=new Table();
   Th1 t1=new Th1(t);
   Th2 t2=new Th2(t);

   t1.start();
   t2.start();
  }
}