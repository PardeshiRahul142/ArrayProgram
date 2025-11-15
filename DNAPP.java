/*6.Write program to input number and check number is duck or not?*/

import java.util.*;
public class DNAPP
{ public static void main(String args[])
  { 
    System.out.println("Check duck number"); 
  
    int no=1212;
    Boolean flag =false;
    while(no !=0)
    { int rem=no%10;
      
      if(rem == 0)
      { flag=true;
        break;
      }
      no=no/10;
    }
 
    if(!flag)
    { System.out.println("Number is duck"+no);
    }
   else
    { System.out.println("Number is not duck"+no);
    }
  }
}