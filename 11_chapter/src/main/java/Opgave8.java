
import java.util.*;

/**
 * Created by Козак on 10.09.2016.
 */

public class Opgave8 {

    public static int minLength(Set<String> set) {

        int a;
        int check = 0;
        NavigableSet<Integer> newset = new TreeSet<Integer>();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            a = it.next().length();
            newset.add(a);
        }
        check = newset.pollFirst();
        return check;
    }

    public static void main(String args[]) {

        Set<String> set = new TreeSet<String>();
        set.add("William");
        set.add("Johnatan");
        set.add("Patrick");
        set.add("Lars");
        set.add("Flemming");
        System.out.print("the shortest name in list contains "+minLength(set)+ " letters.");

    }
}
