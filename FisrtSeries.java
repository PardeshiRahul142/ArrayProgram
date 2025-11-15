 	//1  2  2  4  3  6  4  8  5  10  6  12
public class FisrtSeries{
   public static void main(String args[])
   {
     int n=12;
	 int odd=1;
	 int even=2;
	 
	 for(int i=1;i<=n;i++)
	 {
	 if(i%2!=0)
	 {
	   System.out.print(odd+ " ");//because  i % 2 !=0 
	      odd+=1;//1 , 1+1=2 , 2+1=3 , 3+1=4 , 4+1=5  , 5+1=6
	 }
	 else 
	 {
	   System.out.print(even +" ");// i%2==0  then print
	     even+=2;// 2 , 2+2=4 , 4+2=6 , 6+2=8 , 8+2=10 , 10+2=12
	 }
     }
   }
}
	 