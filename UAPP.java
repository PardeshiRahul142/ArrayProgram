class A
{  
   private A()
   { System.out.println("I am private constructor of A");
   }
   public static void display()
   { System.out.println("I am static method of display");
   }
   public static void show()
   { System.out.println("I am static method of show");
   }
}
public class UAPP
{ public static void main(String args[])
  {   new A();
     A.display();
     A.show();
  }
}