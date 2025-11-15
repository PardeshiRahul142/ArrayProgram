//Count how many times each element appears in the array (without using collections).
public class AppearsElement{
  public static void main(String args[]){
    int a[]={1,13,4,4,45,1};
	int i, j ,count=1;
	boolean flag=false;
	System.out.print("Given array :");
	for(i=0;i<a.length;i++){
	  System.out.print("\t"+a[i]);
	}
	System.out.print("Sort ");
	for(i=0;i<a.length;i++){
		int temp;
		for(j=i+1;j<a.length;j++){
			if(a[i] > a[j]){
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	
	for(i=0;i<a.length;i++){
		if(i==a.length-1){
			System.out.println(a[i]+"  "+count+"times");
	}else if(a[i] == a[i+1]){
		count++;
	}else{
		System.out.println(a[i]+"  "+count+"times");
		count=1;
		}
	}
	}	
  }//main
}//class