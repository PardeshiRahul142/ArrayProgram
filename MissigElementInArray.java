// Write a program in java to find the smallest missing element from a sorted array?
public class MissigElementInArray{
  public static void main(String args[]){
    int a[]={1,2,3,4,6};
	int expNum=a.length+1;
	int totalSum=expNum*(expNum+1)/2; //6*7/2  =21
	System.out.println(totalSum);
	int sum=0;
	for(int i=0;i<a.length;i++){
		sum = sum + a[i];
	}
	System.out.println("missing element is :"+(totalSum - sum )); // 21-16 = 5
 }//main method close
}//class close