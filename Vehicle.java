abstract class Vehicle
{ abstract void engine();
  abstract void color();
  abstract void feature();

}

class VADP extends Vehicle
{
   void engine(){ }
   void color(){ }
   void feature(){ }
}
class Bike extends VADP
{ 
  void engine() 
  { System.out.println("Engine is start ...");
  }
}
class Car extends VADP
{
    void color()
    { System.out.println("Car color is orange...");
    }
}

public class AAPP
{ public static void main(String args[])
  {  Vehicle v=new Bike()
             v.engine();
             v=new Car();
             v.color();
  }
}