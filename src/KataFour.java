public class KataFour {
    public static void main(String[] args) {
        System.out.println("Checking pre- and post- increments:");
        checkPrePost(7, 8);
    }

    public static void checkPrePost(int x1, int x2) {
        int y1 = ++x1;
        int y2 = x2++;
        int[] xy = {x1, y1, x2, y2};
        for (int n : xy) System.out.println(n);
    }
}