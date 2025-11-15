//
public class DiamandPattern
{
 public static void main(String args[])
 {
   for(int i=1;i<=7;i++)
   {
     for(int j=1;j<=7;j++)
	 {
	   if((j>=5-i && j<=i+3 && i<5) || (j>=i-3 && j<=11-i && i>=5))
	// if((j>=5-i && j<=i+3 && i<5) || (j>=i-3 && j<=11-i && i>=5))
	     {
		 System.out.print("*");
		 }
		 else
		 {
			 System.out.print(" ");
		 }
	  }
	  System.out.println();
	}
  }
}
	   