import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] m = {-1,0,1};
        int a = 1;
        try {
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            m[a-1] = 4/a;
            System.out.println(m[a]);
        } catch (ArithmeticException e) {
            System.out.println("Произошла недопустимая арифметическая операция.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Обращение по недопустимому индексу массива.");
        }
        catch (Exception e) {
            System.out.println("Произошло еще какое-то исключение.");
        }
    }
}