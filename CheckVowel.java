/*Write a java program to input any alphabet and check whether it is vowel or consonant*/
import java.util.Scanner;
public class CheckVowel
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the alphabets");
String str=sc.nextLine();
char ch=str.charAt(0);

if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
{
System.out.println(ch +": is vowels");
}
else
{
System.out.println(ch +": is consonant");
}
}
}