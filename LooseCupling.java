interface Engine
{ public void start();
}
class PetrolEngine implements Engine
{
   public void start()
   { System.out.println("Prtrol Engine is start...");
   }
}
class DeselEngine implements Engine
{ 
   public void start()
   { System.out.println("Desel Engine is start...");
   }
}
class ElectricEngine implements Engine
{ 
  public void start()
  { System.out.println("Electric engine is start...");
  }
}
class Car
{  private Engine engine;
   
   Car(Engine engine)   
   { this.engine=engine;
   }
  public void startCar()
  {  engine.start();
     System.out.println("Car is started");
  }
}
public class LooseCupling
{ public static void main(String args[])
  {
     Engine petrol=new PetrolEngine();
     Car c1=new Car(petrol);
         c1.startCar();

    Engine desel=new DeselEngine();
    Car c2=new Car(desel);
        c2.startCar();

    Engine electric=new ElectricEngine();
    Car c3=new Car(electric);
        c3.startCar();
  }
}