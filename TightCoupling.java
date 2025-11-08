
class Engine
{ 
   public void start()
   { System.out.println("Engine start ...");
   }
}
class SwitchOn
{ Engine eng=new Engine();
  
  public void switchOn()
  { 
    System.out.println("Switch on ...");
    eng.start();
  }
}
class CarStart
{
  SwitchOn sw =new SwitchOn();
  public void startCar()
  {  sw.switchOn();
     System.out.println("Car start ...");
  }
}
public class TightCoupling
{ public static void main(String args[])
  { CarStart cs=new CarStart();
             cs.startCar();
  }
}