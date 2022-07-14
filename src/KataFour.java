import java.util.Arrays;

public class KataFour {
    public static void main(String[] args) {
        int[] numz = {8, 3, -5, 42, -1, 0, 0, -9, 4, 7, 4, -4};
        int smallest = 0;
        smallest = (Arrays.stream(numz).min().getAsInt());
        System.out.println(smallest);
        smallest = Integer.MAX_VALUE;
        for (int i : numz)
            smallest = Math.min(smallest, i);
        System.out.println(smallest);
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