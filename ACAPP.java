abstract class Student
{ abstract void study();
  abstract void play();
}
class Rahul extends Student
{ 
  void study()
  { System.out.println("I am doing study ...");
  }
   void play()
 {
 }
}

class Rohan extends Student
{ void study()
  {
  }
  void play()
  { System.out.println("I play a football ");
  }
}
public class ACAPP
{ public static void main(String args[]) 
  {
     Student rah=new Rahul();
             rah.study();
         rah=new Rohan();
         rah.play();
  }
}