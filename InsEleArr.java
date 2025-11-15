public class InsEleArr{
	public static void main(String args[])
	{
		 int a[]={1,4,24,522,34,2,9};
		 int index=2;
		 int value=200;
		 System.out.println("insert element :");
		 for(int i=(a.length-2) ; i>=index;i--)
		 {
			 a[i+1]=a[i];
		 }
		 a[index]=value;
		 System.out.println("after inserting element :");
		 for(int i=0;i<a.length;i++)
		    {
				System.out.println(a[i]);
			}
	}
}