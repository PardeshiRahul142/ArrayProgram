import java.util.*;
public class VCAPP
{
   public static void main(String args[])
   {
       Vector al=new Stack(); 
 
     System.out.println("Current capacity is "+al.capacity());
            al.add(10);
            al.add(20);
            al.add(30);
            al.add(40);
            al.add(50);
            al.add(60);
            al.add(70);
            al.add(80);
            al.add(90);
            al.add(100);
            al.add(130);
                      

        System.out.println("Sixe of vector :"+al.size());
        System.out.println("Capacity of vector :"+al.capacity());

           
   }
}