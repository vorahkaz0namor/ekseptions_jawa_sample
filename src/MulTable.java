import java.util.Scanner;

public class MulTable {
    public static void main(String[] args) {
        // Inserts of some mulfunction table
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i < 11; i++)
            System.out.println(n + " x " + i + " = " + (n * i));
    }
}
