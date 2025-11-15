public class AllDataType{
	public static void main(String args[]){
	 int a=Integer.parseInt(args[0]);
	String name=args[1];
	 float marks=Float.parseFloat(args[2]);
	double fee=Double.parseDouble(args[3]);
         long amt=Long.parseLong(args[4]);


         /*System.out.printf("The integer is %d\n",a);
	 System.out.printf("The string is %s\n",name);
	 System.out.printf("The float is %f\n",marks);
	 System.out.printf("The double is %.2f\n",fee);
	 System.out.printf("The long is %d\n",amt);*/
  
System.out.printf("%d\n %s\n %f\n %.2f\n %d\n",a,name,marks,fee,amt);






}
}