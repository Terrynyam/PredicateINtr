import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> a = x->x.isEmpty();
        Predicate<String> b = String::isEmpty;
        System.out.println(a.test(""));//returns true
        System.out.println(b.test("Terry"));//returns false

        //using BiPredicate
        BiPredicate<String,String> aa = (x,y)->x.startsWith(y);
        BiPredicate<String,String> bb = String::startsWith;

        System.out.println(aa.test("Java","J"));//returns true
        System.out.println(bb.test("Java","j"));//returns false
    }
}