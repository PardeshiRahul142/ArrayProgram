public class PatternNumber{
public static void main(String args[]){
 
 for(int i=1;i<5;i++)
 {
	 int n=1;
   for(int j=1;j<2*i;j++)
   {
     if(j<=i)
	   {
		System.out.print(n+" ");
			 n++;
	   }
	   else
	   {
	     n--;
		System.out.print(n-1+" ");
	   }
	}
	System.out.println();
  }
}
}  