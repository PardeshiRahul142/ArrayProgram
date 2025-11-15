import java.util.*;
class J extends Thread
{  public void run()
   { try{
          for(int i=0;i<5;i++)
          { System.out.println("Good Morning ..."+i);
            Thread.sleep(10000);
          }
        }
     catch(Exception e)
       { System.out.println("Exception occured"+e); 
       }
   }
}
public class TAPP
{ public static void main(String args[])
  {  J th=new J();
      th.start();

  }//main
}//class