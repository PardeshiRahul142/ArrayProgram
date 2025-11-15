//Write a program int n=6 print the series 1 4 3 16 5 36

import java.util.*;
public class SeriesPrint
{
  public static void main(String args[])
  {
   int even =2;
   int odd=1;

 for(int i=1;i<=6;i++)
 {
  if(i % 2 ==1)
 { 
    System.out.print(odd+" ");
     odd+=2;
 }
else
{
    System.out.print(even*even +" ");
       even+=2;
}
}
 

    
  }// main method close
} // class close

    
     