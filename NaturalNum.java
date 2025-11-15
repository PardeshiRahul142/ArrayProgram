//natural number 1 to natural
import java.util.*;
public class NaturalNum
{
public static void main(String sh[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the n ");
int n=sc.nextInt();
if(n!=0)
{
for(int i=1;i<=n;i++)
{
System.out.println(i);
}
}
else
{
 System.out.println("invalid Number");	
}
}
}