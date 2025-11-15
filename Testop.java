public class Testop {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 3, 5};
        int x = 0;
        for (int i = 0; i < a.length; i++)
            x ^= a[i];
        System.out.println(x);
    }
}
