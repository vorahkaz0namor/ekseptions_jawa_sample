public class PreMain {
    public static void premain() {
        int a1 = 4;
            try {
            System.out.println(a1/0);
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя!");
        }
    }
}