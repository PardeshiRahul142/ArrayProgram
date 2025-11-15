public class RecNumPattern
{
 public static void main(String args[])
 { int n=1;
   for(int i=1;i<=5;i++)
   {  
      if( i % 2 ==1)
	  {
     for(int j=1;j<=5;j++)
	 {	
	  System.out.print(n+" ");
	  n++;
	 }
	 }
	 else
	 {
		 int temp=n+4;
		for(int j=0;j<5;j++)
		{
			System.out.print(temp+" ");
			temp--;
			n++;
		}
	 }
	  System.out.println();
   }
  
 }
}
	  
		
	 
	 
	
