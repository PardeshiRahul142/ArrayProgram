import java.util.*;
class ANGAPP
{
   public Boolean validAnagram(String s,String t)
   {
      if(s.length()!=t.length())
      {
         return false;
      }

     char ch1[]=s.toCharArray();
     char ch2[]=t.toCharArray();

     Arrays.sort(ch1);
     Arrays.sort(ch2);

      return Arrays.equals(ch1, ch2);
    }
}
public class AnagramAPP
{
   public static void main(String args[])
   {
     ANGAPP a=new ANGAPP();
     System.out.println(a.validAnagram("anagram","angaram"));
   }
}