/*Q4. Write program to create class name as Area with constructor overloading
       Area(float radius): this function can accept radius as input and calculate circle Area
      Area(int len,int width): this function can accept len and width as input and calculate area of rectangle
*/
import java.util.*;
public class AreaAPP
{   
   public AreaAPP(float radius)
    {  double rad=3.14*radius*radius;
       System.out.println("radius of circle"+rad); 
    }
   public AreaAPP(int len,int width)
    {  int ar=len*width;
       System.out.println("Area of rectangle"+ar);
    }
 public static void main(String args[])
 { AreaAPP ap=new AreaAPP(10);
   AreaAPP ap1=new AreaAPP(10,20);
 }
}