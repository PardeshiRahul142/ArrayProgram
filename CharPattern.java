/* +*
A
AB
ABC
ABCD
ABCDE
*/
public class CharPattern 

{
public static void main(String arhs[])
{
 for(int i=1;i<=5;i++)
 {
 for(int j=1;j<=5;j++)
 {
 if(i>=j)
 {
 System.out.printf("%c",(j+64));
 }
 else
 {
 System.out.printf(" ");
 }
 }
 System.out.println();
 }
 }
 }