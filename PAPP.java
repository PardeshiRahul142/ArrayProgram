import java.util.*;
public class PAPP
{
  public static void main(String args[])
  {
    for(int i=1;i<=5;i++)
   {
      int n=1;
    for(int j=1;j<i*2;j++)
      {
            if(i>j)
            {
              System.out.print((char)(n+64)+" ");
              n++;
            }
          else
            {
               System.out.print((char)(n+64)+" ");
                 n--;
            }
       }
     System.out.println();
  }
}
}