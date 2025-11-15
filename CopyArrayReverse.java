//Reversing the array,
//copy array
public class CopyArrayReverse{
  public static void main(String args[]){
     int a[]={1,2,3,4,5};
	 int i,j,count=0;
	 int b[]=new int[a.length];
     System.out.print("Given array : ");
	   for( i=0 ; i<a.length ; i++){
		   b[b.length - 1 - i ]=a[i];
		   
		   System.out.print("\t"+a[i]);
        } 
		System.out.print("\ncopy array : "); 
		//for(i=a.length-1;i>=0;i--){
			for(i=0;i<b.length;i++){
			
		  System.out.print("\t"+b[i]);
	   }
	}//main close
}//class closew