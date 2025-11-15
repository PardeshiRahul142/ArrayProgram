public class VarargsMain {
    public static void main(String... args) {
        System.out.println("Number of arguments: " + args.length);
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
