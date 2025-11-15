public class NumP
{
public static void main(String sd[])
{
for(int i=1;i<=5;i++)
{
 int count=1;
 for(int j=1;j<=9;j++)
 {
   if(j>=6-i && j<=4+i)
   {
   System.out.print(count);
   if(j<5)
   {
   count++;
   }
   else
   {
   --count;
   }
   }
   }
   System.out.println();
   }
   }
  }