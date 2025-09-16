import java.util.*;
public class PatterDiamond
{  public static void main(String args[])
   {
    for(int i=1;i<=9;i++)
    {
      for(int j=1;j<=9;j++)
      {
        if((i==5 && j<=9)||(j==5 && i<=9)||(j==6-i && j<5)||(j>=6 && j==4+i) ||(i>5 && j==i-4)||((i==6 && j==8 )||(i==7 && j==7)||(i==8 && j==6)))
        { System.out.print("*");
        }
       else
        {System.out.print(" "); 
        }
      }
    System.out.println();
    }
   }//main
}//class