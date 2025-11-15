/*Q5. Problem:
 Write a Java program that accepts two integers and divides them.
 Ensure that a message "Program executed successfully" is always displayed — whether or not an exception occurs — using a finally block.
Concept Focus:
 Use of finally block (it always executes).
*/

import java.util.*;
public class TNAPP
{ public static void main(String args[])
  {   int a=10;
      int b=20;
      

    try{
            int c=a/b;
           System.out.println("Division is :"+c);
       }
    catch(Exception e)
    {  System.out.println(e);
    }
   finally
    { System.out.println("Program execute successfully");
    }
  }
}