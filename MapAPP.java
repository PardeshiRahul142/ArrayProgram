import java.util.*;
public class MapAPP
{
   public static void main(String args[])
   {
    Map<Integer,String> lmap=new LinkedHashMap<>();
                       lmap.put(1,"Rahul");
                       lmap.put(2,"Rohan");
                       lmap.put(3,"Nikhil");
 
        Object obj=lmap.get(10);
        if(obj!=null)
        { System.out.println("Element is found"); 
        }
       else
         { System.out.println("Elements not found");
         }

   }
}