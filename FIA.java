import java.util.*;
abstract class FI
{
   public void view()
   {
      System.out.println("I am view method ");
   }
   public abstract void display();
}

public class FIA
{ 
   public static void main(String args[])
   {
     FI f=new FI(){

      public void display()
      {
        System.out.println("I am abstract method ");
      }
     };
    f.display();
   f.view();
   }
}