/*Q2. Write program to create class name as CheckChar with two functions
        void setChar(char ch): this function accept single character as input
      boolean checkChar(): this function can check character is alphabet or digit of special     symbol if
     character is alphabet or digit return true if character is digit then return false.
*/

import java.util.*;
public class CheckChar
{
   char ch;
   public void setChar(char cha)
   { ch=cha;
   }
 
   public Boolean checkChar()
   { 
     if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
     { return true;
     }
     else if(ch>='0' && ch<='9')
     { return true;
     }
     else
     { return false;
     }
   }
  public static void main(String agrs[])
  { Scanner sc=new Scanner(System.in);
    CheckChar c=new CheckChar();
    System.out.println("Enter the charactor");
    char a=sc.next().charAt(0);
    c.setChar(a);
    System.out.println(c.checkChar());
  }
}