public class AUTOBOXAPP
{ public static void main(String args[])
  { int a=100;
    Integer b=a; //autoboxing

    Integer c=1000;
    int d=c;

    Long l=200L;
    int li=l.intValue();// using intValue() method perform auto Unboxing in long to int datatype;

    double dl=l.doubleValue();
    float fl=l.floatValue();

    System.out.println(d);
    System.out.println(b);

    System.out.println("Long into int  :"+li);
    System.out.println("Long into double :"+dl);
    System.out.println("Long into float :"+fl);
   
  }
}