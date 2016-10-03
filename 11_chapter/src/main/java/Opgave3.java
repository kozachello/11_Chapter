import java.util.*;

/**
 * Created by Козак on 09.09.2016.
 */
public class Opgave3 {

    public static List<Integer> removeEvenInRange(List<Integer> list, int start, int end) {

            List<Integer> newlist = new LinkedList<Integer>();
            List<Integer> cut = list.subList(start, end);
        ListIterator<Integer> it = cut.listIterator();
        System.out.print("These elements: ");
        while (it.hasNext()) {
            int a = it.next();
            if(a%2==0) {
                System.out.print(a+" ");
            }
        } System.out.print(" must be removed from ==> ");

            newlist.addAll(list);

        return newlist;
    }
    public static void main(String args[]) {

        int start = 5;
        int end = 13;
        int[] arr = {1, 1, 2, 0, 4, 5, 6, 8, 8, 3, 11, 9, 12, 0, 14, 0, 16};
        List<Integer> list = new LinkedList<Integer>();
        for(int a: arr) {
            list.add(a);
        }
        System.out.print(removeEvenInRange(list, start, end));
    }
}
