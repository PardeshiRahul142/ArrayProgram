//copy array
public class CopyArray{
  public static void main(String args[]){
     int a[]={1,2,3,4,5};
	 int i,j;
	 int b[]=new int[a.length];
     System.out.print("Given array : ");
	   for( i=0 ; i<a.length ; i++){
		   b[i]=a[i];
		   System.out.print("\t"+a[i]);
        } 
		System.out.print("\ncopy array : "); 
		for(i=0;i<b.length;i++){
			
		  System.out.print("\t"+b[i]);
	   }
	}//main close
}//class close