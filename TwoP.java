/*
1234567
234567
34567
4567
567
67
7
1
12
123
1234
12345
123456
1234567

* * * * * * *
* * * * * *
* * * * *
* * * *
* * *
* *
*
*
* *
* * *
* * * *
* * * * *
* * * * * *
* * * * * * *

ABCDEFG
BCDEFG
CDEFG
DEFG
EFG
FG
G
A
AB
ABC
ABCD
ABCDE
ABCDEF
ABCDEFG
*/
public class TwoP{
  public static void main(String args[]){
   for(int i=1;i<=7;i++) {
    for(int j=1;j<=7;j++){
	 if(j>=i){
	   //System.out.print((char)(j+64));
	   //System.out.print("* "); 
	   System.out.print(j);
	  }
	 }System.out.println();
	}
	
	 for(int i=1;i<=7;i++){
     for(int j=1;j<=7;j++){
	   if(i>=j){
	  // System.out.print((char)(j+64)); //for charactor
	  //System.out.print("* ");
	  System.out.print(j);
	  }
	 }System.out.println();
	}
	
  }
}