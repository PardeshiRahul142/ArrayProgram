/*To access CRED programs, one needs to have a credit score of 750750 or more.
 Given that the present credit score is XX, determine if one can access CRED programs or not.
If it is possible to access CRED programs, output \text{YES}YES, otherwise output \text{NO}NO.
*/
import java.util.Scanner;
public class Credit
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the credit card score");
int credit_Score=sc.nextInt();

if(credit_Score>=750)
{
System.out.print("YES");
}
else
{
System.out.print("NO");
}
}
}