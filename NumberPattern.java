//pattern of number

/*
1
12
123
1234
12345
*/
public class NumberPattern
{
public static void main(String s[])
{
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
if(j<=i)
{
System.out.printf("%d",j);
}
else{
System.out.print(" ");
}
}
System.out.println();
}
}
}