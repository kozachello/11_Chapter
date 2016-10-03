
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by Козак on 10.09.2016.
 */
public class Opgave6 {

    public static LinkedList<Integer> countUnique(LinkedList<Integer> list) {

        int a;
        int count = 0;
        LinkedList<Integer> newlist = new LinkedList<Integer>();
        ListIterator<Integer> it = list.listIterator();
        while(it.hasNext()) {
            a = it.next();
            if(!newlist.contains(a)) {
                newlist.add(a);
                count++;
            }
        }
        System.out.println(count+ " unique numbers:");
        return newlist;

    }

    public static void main(String args[]) {

        int[] arr = {3, 7, 3, -1, 2, 3, 7, 2, 15, 15};
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int a: arr) {
            list.add(a);
        }
        System.out.print(countUnique(list));
    }
}
