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

public class DCAPP
{  public static void main(String args[])
   {
      Par p=new Ch();
          p.show();

      Ch c=(Ch)p;
         c.show();
    
   }
}