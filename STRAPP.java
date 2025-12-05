import java.util.*;
public class STRAPP
{ public static void main(String args[])
  {
      String str="hello world";
      String st[]=str. split("\\s+");
      for(String s:st)
      { System.out.println(s);
      }
  }
}