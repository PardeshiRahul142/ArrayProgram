import java.util.*;
public class VAPP
{ public static void main(String args[])
  {

    Vector v=new Vector<>();
           v.add(10);
           v.add(20);
           v.add(30);
           v.add(40);
     for(Object val:v)
     {  System.out.println(val);
     }
  }
}