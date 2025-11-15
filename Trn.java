// terinary operator

public class Trn
{
public static void main(String args[])
{
int marks = 85;
String grade = (marks >= 90) ? "A" : (marks >= 75) ? "B" : "C";
System.out.println(grade);
}
}