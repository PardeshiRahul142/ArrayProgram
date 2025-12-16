//Count Vowels in String

import java.lang.*;
import java.util.*;
public class CVAPP
{
  public static void main(String args[])
  {
    String str="eduction is important";
   int count=0;
   String s=str.toLowerCase();
   for(int i=0;i<s.length();i++)
   { 
      if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o'|| str.charAt(i)=='u')
      {
          count++;
      }
  }
 System.out.println("Count of vowels is :"+count);
  }
}