import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorTests {
    public static void main(String[] args) {
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