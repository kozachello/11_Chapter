import java.util.*;

/**
 * Created by Козак on 10.09.2016.
 */

public class Opgave7 {

    public static int countCommon(List<Integer>list1, List<Integer>list2) {

        int count = 0;
        int a;
        ListIterator<Integer> it = list1.listIterator();
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        while(it.hasNext()) {
            a = it.next();
            set1.add(a);
        }
        it = list2.listIterator();
        while(it.hasNext()) {
            a = it.next();
            set2.add(a);
            }
        Iterator<Integer> itr = set1.iterator();
        while(itr.hasNext()) {
            a = itr.next();
            if(set2.contains(a)) {
                count++;
            }
        }

        return count;

    }

    public static void main(String args[]) {

        int[] arr1 = {3, 7, 3, -1, 2, 3, 7, 2, 15, 15};
        int[] arr2 = {-5, 15, 2, -1, 7, 15, 36};
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();

        for(int a: arr1) {
            list1.add(a);
        }
        for(int a: arr2) {
            list2.add(a);
        }

        System.out.print(countCommon(list1, list2)+ " elements occur in both lists");

    }
}
