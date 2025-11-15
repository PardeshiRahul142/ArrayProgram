import java.util.*;
public class FiboRecursion
{
  public static void fibo(int n , int a, int b) 
  { 
     if(n > 0)
     { System.out.print(a+" ");
       fibo(n-1,b,a+b);
     }
   
  }
  public static void main(String args[])
  {
    int num=10;
   fibo(num, 0,1);
  }
 
}