public class PLProgram{
 public static void main(String args[]){
   int cp = Integer.parseInt(args[0]);
   int sp =Integer.parseInt(args[1]);
   String result= cp>sp ? "loss"+(cp-sp) :"profit"+(sp-cp);
 	System.out.printf("The product is %s",result);
}
}
 