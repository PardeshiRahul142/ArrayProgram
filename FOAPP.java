import java.util.*;
public class FOAPP
{
  void add(int a,int b)
      {
        System.out.println("Sum :"+(a+b));
      }
      void add(double a,int b)
      {
        System.out.println("sum :"+(a+b));
      }
      int add(int k ,int p)
      { return k+p;
      }
     
  public static void main(String args[])
  {
     FOAPP f=new FOAPP();
           f.add(10,20);
           f.add(2.5,2);
    System.out.println(f.add(40,30)); 
  }
}//class