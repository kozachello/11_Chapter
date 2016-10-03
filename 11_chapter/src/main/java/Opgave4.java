import java.util.*;
/**
 * Created by Козак on 10.09.2016.
 */
public class Opgave4 {
    public static LinkedList<Integer> partition(List<Integer> list, int value) {

        int check;
        LinkedList<Integer> newlist = new LinkedList<Integer>();
        ListIterator<Integer> it = list.listIterator();
        while(it.hasNext()) {
            check = it.next();
            if(check < value) {
                newlist.addFirst(check);
            } else newlist.addLast(check);
        }
        return newlist;
    }
    public static void main(String args[]) {

        int value = 5;
        int[] arr = {15, 1, 6, 12, -3, 4, 8, 21, 2, 30, -1, 9};
        List<Integer> list = new LinkedList<Integer>();
        for(int a: arr) {
            list.add(a);
        }
        System.out.print(partition(list, value));
    }
}
