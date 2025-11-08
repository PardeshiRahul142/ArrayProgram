/*Q1. Write a program to crate class name as Value with single function name as setValue(int,int) and we have to create three child classes name as Add with function int getAdd() , Mul with function getMul() and Div with function getDiv() and getAdd() function return addition of two value which is inherited from Value class , getMul() function return multiplication of two values which is inherited from Value class and gitDiv() function return division of two values which Is inherited from Value class.
*/

class Value
{ int a,b;
  public void setValue(int x , int y)
  { this.a=x;
    this.b=y;
  }
}

class Add extends Value
{ 
  public int getadd()
  {
     return a+b;
  }
}
class Mul extends Value
{
  public int getMul()
  { return a*b;
  }
}
class Sub extends Value
{
  public int getSub()
  {  return a-b;
  }
}

public class AAPP
{ public static void main(String args[])
  {
    
      Add ad=new Add();
          ad.setValue(10,20);
        System.out.println(ad.getadd());

            Mul ml=new Mul();
          ml.setValue(10,20);
        System.out.println(ml.getMul());
 
      
          
  }
}