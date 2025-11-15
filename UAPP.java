import java.util.*;
class A
{ 
    private A()
    { System.out.println("I am private constructor");
    }
    public static void show()
    { System.out.println("I am static show method..");
    }
  
}
public class UAPP
{  public static void main(String args[])
   {
     A.show();
     new A();
 
   }
}