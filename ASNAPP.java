/*3.Write program to character from keyboard and check character is alphabet digit or special symbols?
*/

import java.util.*;
public class ASNAPP
{ public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the charactor :");
    char ch=sc.nextLine().charAt(0);

    if((ch>='a' && ch<='z')|| (ch>='A' && ch<='Z'))  
    { System.out.println("Is charactor");
    }
    else if(ch>='0' && ch <= '9')
    { System.out.println("This is a digit");
    }
    else
    { System.out.println("Is a special symbole");
    }
  }
}//class