/*5.Write program to input number and check number is perfect or not?*/

import java.util.*;
public class PERNOAPP
{ public static void main(String args[])
  { int no=28;
    int sum=0;
    int temp=no;
    for(int i=1;i<no;i++)
    { if(no%i==0)
      { sum=sum+i;
      }
    }
    if(sum == no)
    {System.out.println("number is perfect");
    }
    else
    { System.out.println("Number is not perfect");
    }
  }
}//class