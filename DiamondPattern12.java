public class DiamondPattern12 {
    public static void main(String[] args) {
        int n = 5; // height

        // upper half
        for (int i = 0; i < n; i++) {
            for (int j = -n; j <= n; j++) {
                if (j == 0 || j == -i || j == i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for(int i=0;i<1;i++)
         {
           for(int j=0;j<9;j++)
          {
           System.out.print("*");
          }
        }
        // lower half
        for (int i = n - 2; i >= 0; i--) {
            for (int j = -n; j <= n; j++) {
                if (j == 0 || j == -i || j == i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
