public class CDAPP
{ 
    static Integer a;
    static int b;
 

   public static void main(String args[])
   {
    System.out.println("I am Integer class : "+System.identityHashCode(a)); //class
    System.out.println("I am int data type :"+System.identityHashCode(b));  // simple datatype
   }
}