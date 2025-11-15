public class SumOFN
{
  public static void main(String args[])
  {
    System.out.print(sumOfNat(9));
  }
   public static int sumOfNat(int n)
   {  
     if(n==1)
	 {
	    return 1;
	 }
	 return n+sumOfNat(n-1);
    }
}