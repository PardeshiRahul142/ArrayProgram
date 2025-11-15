public class EleCountProgram{
public static void main(String srgs[]){
 int a[]={1,2,34,4,3,4,5};
 int i,j;
 System.out.println("Frequencey count ");
 for(i=0;i<a.length;i++)
 {
     boolean flag =false;
	for(j=0;j<i;j++)
	 {
	   if(a[i]==a[j])
	   {
		
	     flag=true;
		 break;
	   }
	   
	   if(flag){
	   continue;
	   }
	   int count =1;
	   
	   for(j=i+1;j<a.length;j++){
	     if(a[i] == a[j]){
		 count++;
		 }
	   }

	   System.out.println(a[i] +"  "+count+"times");
	 }
	 
	}
}
}