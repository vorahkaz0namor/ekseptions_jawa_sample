import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class KataFour {
    public static void main(String[] args) {
        System.out.println("Checking pre- and post- increments:");
        checkPrePost();
        System.out.println("Iterator tests:");
        iteratorTests();
    }

    public static void checkPrePost() {
        int x1 = 10, x2 = 10;
        int y1 = ++x1;
        int y2 = x2++;
        int[] xy = {x1, y1, x2, y2};
        for (int n : xy) System.out.println(n);
    }

    public static void iteratorTests() {
        List<String> spisok = new ArrayList<>();
        spisok.add("qwe");
        spisok.add("asd");
        spisok.add("zxc");
        spisok.add("rty");
        spisok.add("fgh");
        spisok.add("vbn");
        spisok.add("uio");
        spisok.add("jkl");
        spisok.add("mp");
        int i = 35;
        ListIterator<String> lite = spisok.listIterator();
        lite.forEachRemaining(System.out::println);
        lite = spisok.listIterator();
        while (lite.hasNext()) {
            i = i + 3;
            char s = (char) i;
            lite.next();
            lite.set(String.valueOf(s));
        }
        while (lite.hasPrevious())
            lite.previous();
        lite.forEachRemaining(System.out::print);
    }
}