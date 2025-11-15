public class BfPattern
{
public static void main(String args[])
{
 for(int i=1;i<=5;i++)
 {
 for(int j=1;j<=10;j++)
 {
 if(((i>=j || j>=11-i) && i<=5) || ((j<=11-i && j>=i) && i>5))
 {
 System.out.print("*");
 }
 else
 {
 System.out.print(" ");
 }
 }
 System.out.println();
 }
 for(int i=5;i>=1;i--)
 {
 for(int j=1;j<=10;j++)
 {
 if(((i>=j || j>=11-i) && i<=5) || ((j<=11-i && j>=i) && i>5))
 {
 System.out.print("*");
 }
 else
 {
 System.out.print(" ");
 }
 }
 System.out.println();
 }
 
 }
 }
  
  

