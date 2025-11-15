public class DupliacteEle{
	public static void main(String args[]){
		int a[] = {5, 5, 2, 1, 2,4 ,2,5 };
		int size=a.length;
			for(int i=0;i<size-1;i++)
			{  
               boolean flag=false;
				int count=1;
				for(int k=0;k<i;k++)
				   {
					   if(a[i] == a[k])
						   {
							   flag=true;
							   break;
						   }
				   }
				       if(flag)
					     continue;		
		          
				for(int j=i+1;j<size;j++)
					{	
						if(a[i] == a[j])
							{
								count++;
							}
					}
					if(count>1){
						System.out.println("duplicate"+a[i]);
					}
			}	
		
	    			
	}
}
	
