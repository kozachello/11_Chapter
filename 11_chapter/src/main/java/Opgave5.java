import java.util.*;

/**
 * Created by Козак on 10.09.2016.
 */

public class Opgave5 {

    public static Set<Integer> sortAndRemoveDublicates(List<Integer> list) {

        int a;
        Set<Integer> set = new HashSet<Integer>();
        ListIterator<Integer> it = list.listIterator();
        while(it.hasNext()) {
            a = it.next();
            set.add(a);
        }
        return set;
    }

    public static void main(String args[]) {

        int[] arr = {7, 4, -9, 4, 15, 8, 27, 7, 11, -5, 32, -9, -9};
        List<Integer> list = new LinkedList<Integer>();
        for(int a: arr) {
            list.add(a);
        }
        System.out.print(sortAndRemoveDublicates(list));
    }

}
