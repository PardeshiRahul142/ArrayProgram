import java.util.Scanner;
public class charactorConverter
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the charactor");

char ch=sc.nextLine().charAt(0);
System.out.println("The before converting character  :" + ch);
if(ch>='a' && ch <='z')
{
    ch = (char) ((int) ch-32);
}
else{
     ch= (char) ((int)ch+32);
}
System.out.print("the after converting charactor is  :" + ch);
}
}