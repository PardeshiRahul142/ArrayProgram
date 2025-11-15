public class MCQ
{
 public static void main(String a[])
{
    
   int[] x = {5, 4, 3, 2, 1};
        for (int i = 0; i < x.length / 2; i++) {
            int t = x[i];
            x[i] = x[x.length - 1 - i];
            x[x.length - 1 - i] = t;
        }
        System.out.println(x[0]);
}
}