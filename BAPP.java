class B
{ private static B b1;
  
  private B()
  { System.out.println("I am private constructor");
  }
 
   public static B getAdd()
   { if(b1==null)
       { b1=new B();
         System.out.println("b1 :"+System.identityHashCode(b1));
       }
     return b1;
   }
}
public class BAPP
{ public static void main(String args[])
  {
      B b1=B.getAdd();  
      System.out.println("b1 :"+System.identityHashCode(b1));

       B b2=B.getAdd();  
      System.out.println("b2 :"+System.identityHashCode(b2));

        B b3=B.getAdd();  
      System.out.println("b3 :"+System.identityHashCode(b3));


  }
}