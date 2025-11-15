import java.util.*;
public class DemoFun
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the five subjects marks of student :");
  int s1=sc.nextInt();
  int s2=sc.nextInt();
  int  s3=sc.nextInt();
  int  s4=sc.nextInt();
  int  s5=sc.nextInt();
  int res=per(s1,s2,s3,s4,s5);
   System.out.print("percentage :"+res);
  }
 public static int per(int s1, int s2,int s3,int s4 , int s5)
 {
   int agg=s1+s2+s3+s4+s5;
   int marks=agg/5;
   return marks;
  }
 }