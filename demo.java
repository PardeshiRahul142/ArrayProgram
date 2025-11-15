public class demo
{
public static void main(String args[])
{
int n=123456789;
int result=0;
while(n>0)
{
int lastNum = n % 10;
result =result*10+lastNum;
n = n / 10;
}
System.out.println(result);
}
}
