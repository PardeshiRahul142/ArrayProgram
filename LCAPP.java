import java.util.*;
class Value
{
  int a,b;

  void setValue(int a,int b)
  { 
      this.a=a;
      this.b=b;
  }  
  int getResult()
  {
     return 0;
  }
}
class Add extends Value
{
    int getResult()
    {
      return a+b;
    }
}
class Mul extends Value
{
    int getResult()
    {
      return a*b; 
    }
}
class Pow extends Value
{
  int getResult()
  {
   int p=1;
   for(int i=0;i<b;i++)
   { p=p*a;
   }
    return p;
  }
}

class Cal
{
   void checkCal(Value v)  
   {
      int res=v.getResult();
      System.out.println(res);
   }
}

public class LCAPP
{
   public static void main(String args[])
  {
     Cal c=new Cal();
     Value val=null;
     val=new Add();
     val.setValue(10,30);
     c.checkCal(val);

     val=new Mul();
     val.setValue(10,20);
     c.checkCal(val);
    
     val=new Pow();
     val.setValue(10,5);
     c.checkCal(val);
  }
}