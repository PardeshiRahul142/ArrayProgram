/*Q8. Write a program to display the following pattern using nested loops:
			 *******
			 ******
 			 *****
 			 ****
 			 ***
 			 **
 			 *
 			 **
 			 ***
 			 ****
 			 *****
 			 ******
 			 *******    
*/

import java.util.*;
public class Pat
{ public static void main(String args[])
  { 
   for(int i=1;i<=13;i++)
   { for(int j=1;j<=8;j++)
     { if((i<=7 && j<=8-i) || (i>7 && j<=

i-6))
       { System.out.print("*");
       }
       else
       {System.out.print(" ");
       }
     
     }
     System.out.println();
   }
  
  }
}//class