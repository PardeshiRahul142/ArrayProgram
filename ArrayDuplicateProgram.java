 
public class ArrayDuplicateProgram {
  

    public static void main(String[] args) {
        
        int []a={1,3,1,3,1,4};
        int[]b=new int[a.length];
         int k=0;
        for (int i = 0; i < a.length; i++) {
              // check a[i] isFound in array b
                  boolean isFound=false;
                for (int j = 0; j < b.length; j++)
                 {
                  if (a[i]==b[j])
                   {
                   isFound=true;  
                   break;
                  }  
                }
                if(isFound==false)
                {
                    b[k]=a[i];
                    k++;
                }

        }
        System.out.println("Array without duplicat elements");
        for (int i = 0; i < k; i++) {
            System.out.println(b[i]);
        }
            
    }
}
