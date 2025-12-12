class AA
{ 
   private static AA aa;
  
   private AA()
   {
     System.out.println("I am private constructor ");
   }

   public static AA getIns()
   {
     if(aa==null)
     {
       aa=new AA();
     }
     return aa;
   }
}
public class AAAAPP
{
  public static void main(String args[])
  { 
         AA a1=AA.getIns();
      System.out.println("a1 "+System.identityHashCode(a1));
   
  }
}