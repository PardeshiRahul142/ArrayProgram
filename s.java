public class s{
public static void main(String args[]){
  int n=6;
  int even=2;
  int odd=1;
  for(int i=1;i<=n;i++)
  {
   if(i%2 !=0)
   {
   System.out.print(odd+" ");
        odd+=2;
	}
	else
	{
	   System.out.print(even*even+"  ");
	     even +=2;
	}
	}
}
}