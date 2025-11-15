import java.util.*;
public class AvgMarks
{
public static void main(String aa[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the five subject marks ");
float math = sc.nextFloat();
float java = sc.nextFloat();
float python = sc.nextFloat();
float C =sc.nextFloat();
float CPP = sc.nextFloat();

float totalMarks = math + java + python + C + CPP;
 
float AvgOfMarks=totalMarks / 5 ; 

System.out.print("\n The total marks is :"+totalMarks);
System.out.print("\n The Average marks is :"+AvgOfMarks);
}
} 
