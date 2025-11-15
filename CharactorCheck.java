/* Q5. Write a java program to check whether a character is uppercase or lowercase alphabet.*/
import java.util.*;
public class CharactorCheck
{
public static void main(String argd[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the charactror");
char ch =sc.nextLine().charAt(0);

if(ch>='a' && ch<='z')
{
   System.out.print("The charactor is lower case : "+ch);
}
else if(ch>='A' && ch<='Z')
{
   System.out.print("The charactor is uppercase : "+ch);
}
else
{
System.out.print("it is not charactor ");
}

}
}