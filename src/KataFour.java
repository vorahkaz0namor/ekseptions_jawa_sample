import java.util.Arrays;

public class KataFour {
    public static void main(String[] args) {
        int[] numz = {8, 3, -5, 42, -1, 0, 0, -9, 4, 7, 4, -4};
        int smallest = 0;
        smallest = (Arrays.stream(numz).min().getAsInt());
        System.out.println(smallest);
    }
}
