//teble print ;
import java.util.*;
public class TablePrintRec
{int count=1;
  public static void main(String args[])
  { 
    int n=10;
	table(n)
	}
  public static void table(int n)
  {
   if(count<10)
   {
    count++;
	System.out.println(count * n)
	table(n);
   }
 }
}