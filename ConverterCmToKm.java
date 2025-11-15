import java.util.*;
public class ConverterCmToKm
{
public static void main(String ags[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the length in Centimeter ");
double cm = sc.nextDouble();
double Km=cm/100000;
System.out.println("The kilometer is :"+Km);
}
}