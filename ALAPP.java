import java.util.*;
public class ALAPP
{ public static void main(String args[])
  {  List<Integer> al=new ArrayList<Integer>();
                   al.add(200);
                   al.add(330);
                   al.add(500);
 
         int count=0;
        for(Integer val:al)
        { count++;
        }
        for(int i=count-1;i>=0;i--)
        { System.out.println(al.get(i));
        }
  }
}