import java.util.Arrays;

public class KataFour {
    public static void main(String[] args) {
        System.out.println("Checking pre- and post- increments:");
        checkPrePost();
    }

    public static void checkPrePost() {
        int x1 = 10, x2 = 10;
        int y1 = ++x1;
        int y2 = x2++;
        int[] xy = {x1, y1, x2, y2};
        for (int n : xy) System.out.println(n);
    }
}