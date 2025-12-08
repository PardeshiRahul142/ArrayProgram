class Base1 { 
    Base1() {
        print();
    } 
    void print() {
        System.out.println("Base1");
    } 
} 

public class Base2 extends Base1 { 
    int number = Math.round(7.4f); 
public static void main(String args[]) { 
        Base1 base = new Base2(); 
        base.print(); 
    } 

    void print() {
        System.out.println(number); // line 1
    } 
} 
