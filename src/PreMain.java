public class PreMain {
    public static void main(String[] args) {
        int a1 = 4;
            try {
            System.out.println(a1/0);
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя!");
        }
        System.out.println("Значение а1 увеличилось до " + (a1+5));
    }
}