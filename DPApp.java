//Dimond problem 
interface A
{ void show();
}
interface B
{ void show();
}
class C
{ void show()
  { System.out.println("I am c");
  }
}
class D extends C implements A,B
{
     public void show()
     { //super.show();
       System.out.println("I am D ");
     }
}
public class DPAPP
{ public static void main(String args[])
  { //D d1=new D();
   //  d1.show();


   A a1=new D();
     a1.show();

   
  }
}
