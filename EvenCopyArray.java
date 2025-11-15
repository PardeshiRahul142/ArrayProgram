//copy array
public class EvenCopyArray{
  public static void main(String args[]){
     int a[]={1,2,3,4,5};
	 int i,j=0;
	 
	 int b[]=new int[a.length];
     System.out.print("Given array : ");
	 for( i=0 ; i<a.length ; i++){
		    System.out.print("\t"+a[i]);  
	    }
		
		//logic of copy array;
	   for( i=0 ; i<a.length ; i++){
	       if(a[i] % 2==0){     //only even element are copy 
		   b[j]=a[i];           //
		   j++;                 //count element even
		   }
		} 
		System.out.print("\ncopy array : "); 
		for(i=0;i<j;i++){        //i<j size of j iterate loop that time ;
			  
		  System.out.print("\t"+b[i]);
	   }
	}//main close
}//class close