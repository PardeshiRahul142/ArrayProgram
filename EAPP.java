public class EAPP
{ public static void main(String args[])
  {
     try
      {
         int a[]=new int[-2];
         a[2]=100;
         System.out.println(a[2]);
      }
      catch(Exception e)
      {  System.out.println("array indexOut"+e);
      }
  }
}