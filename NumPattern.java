public class NumPattern
{
public static void main(String args[])
{
 for(int i=0;i<=4;i++)
 {
 for(int j=0;j<=4;j++)
 {
   System.out.print(" "+((j<=i)?i-j:j-i));
 }
    System.out.println();
   }
  }
}