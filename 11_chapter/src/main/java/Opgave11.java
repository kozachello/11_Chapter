import java.util.*;

/**
 * Created by Козак on 12.09.2016.
 */
public class Opgave11 {

    public static Set<Integer> symetricSetDifference(Set<Integer> first, Set<Integer> second) {
        Set<Integer> newset = new TreeSet<Integer>();
        for(int i: first) {
            if(second.contains(i)) {
                second.remove(i);
            } else newset.add(i);
        }
        for(int i: second) {
            if(first.contains(i)) {
                first.remove(i);
            } else newset.add(i);
        }

        return newset;
    }

    public static void main(String args[]) {
        Set<Integer> first = new TreeSet<Integer>();
        Set<Integer> second = new TreeSet<Integer>();
        int[] arr1 = {1,2,6,5,9};
        int[] arr2 = {6,3,4,9};
        for(int i: arr1) {
            first.add(i);
        }
        for(int i: arr2) {
            second.add(i);
        }
        System.out.print(symetricSetDifference(first, second));
    }
}
