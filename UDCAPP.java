import java.util.*;
class Par
{ public void show()
  { System.out.println("I am show method of parent class");
  }
}
class Ch extends Par
{ public void display()
  { System.out.println("I am display of child");
  }
}

public class UDCAPP
{  public static void main(String args[])
   {
     Par ch1=new Ch();// up casting 
         ch1.show();
         
     Par ch2=(Par)ch1;//Up casting 
         ch2.show();

     Ch c=(Ch)Par;
        c.display();
        c.show();
   }
}