//
public class PTranPatt{
  public static void main(String args[]){
    for(int i=1;i<=9;i++){
	  for(int j=1;j<=5;j++){
	   if((j>=6-i && i<=5)||(j>=i-4 && i>5))
	     {
		    System.out.print("* ");
		 }else{
		    System.out.print("  ");
		  }
	  }
	  System.out.println();
	}
 }
}
		 