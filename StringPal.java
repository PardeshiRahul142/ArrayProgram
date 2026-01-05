import java.util.*;
public class StringPal
{ public static void main(String args[])
  {
     String str="madwam";

     int left=0;
     int right=str.length()-1;
     boolean flag=false;
     while(left<right)
     {
        if(str.charAt(left) != str.charAt(right))
        {
           flag=true;
           break;
        }
        left++;
        right--;
     }
     if(!flag)
     {  System.out.println("String is palindrome");
     }
    else
     {  System.out.println("String not palindrome");
     }
  }
}
