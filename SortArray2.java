import java.util.*;
public class SortArray2{
   public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
	   System.out.println(" Enter the size of array");
		int n=sc.nextInt();
		int a[]=new int[n];
		int i,j;
		System.out.println("Enter the element in array");
		  for(i=0;i<a.length;i++)
		    {
			   a[i]=sc.nextInt();
			}
		System.out.println("Before sort array ");
		  for(i=0;i<a.length;i++)
		    {
				System.out.println("  "+a[i]);
			}
		
		  for(i=0;i<a.length;i++)
		    {
			  for(j=i+1;j<a.length;j++)
			    {
				  if(a[i] < a[j])
				    {
					  int temp = a[i];
					      a[i] = a[j];
						  a[j] = temp;
					}
				}
			}
		System.out.println("Sorted Array :");
		  for(i=0;i<a.length;i++)
		    {
			  System.out.println("  "+a[i]); 
			}
	}
}