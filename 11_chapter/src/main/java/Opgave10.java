import java.util.*;

/**
 * Created by Козак on 10.09.2016.
 */

public class Opgave10 {

    public static Set<String> removeOddLength(Set<String> set) {

        int a;
        String str;
        Set<String> newset = new TreeSet<String>(set);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            str = it.next();
            a = str.length();
            if(a%2!=0) {
                newset.remove(str);
            }
        }
        return newset;
    }

    public static void main(String args[]) {

        Set<String> set = new TreeSet<String>();
        set.add("Dominic");
        set.add("Johnatan");
        set.add("Abraham");
        set.add("Lars");
        set.add("Flemming");
        System.out.print("our set without odds ==> "+removeOddLength(set));

    }
}
