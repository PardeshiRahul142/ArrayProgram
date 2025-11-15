/*9.Write program to check number is prime or not?
*/

import java.util.Scanner;
public class PRNAPP
{ public static void main(String args[])
  { int n=1;
    Boolean flag=false;

    if(n<=1)
    { flag=true;
    }
    else
    { 
      for(int i=2;i<=n/2;i++)
      { if(n % i==0)
         { flag=true;
            break;
         }
      }
     }
     if(!flag)
     { System.out.println("Prime number");
     }
     else
     { System.out.println("Not prime number");
     }
  }
}