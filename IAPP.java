interface College
{ void study();
  void work();
}
class ADP implements College
{ public void study(){ }
 public void work(){ }
}
class Student extends ADP
{ 
   public void study()
   { System.out.println("Stdent doing study..");
   } 
}
public class IAPP
{ public static void main(String args[])
  {
    College c=new Student();
            c.study();
           
  }

}