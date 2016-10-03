import java.util.*;

/**
 * Created by Козак on 20.09.2016.
 */
public class Opgave15 {
    public static int maxOccurences(ArrayList<Integer> list) {
        int count = 0;
        int result = 0;
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for(int i: list) {
            for(int j: list) {
                if(i==j) {
                    count++;
                    map.put(count, i);
                }
            }
            count = 0;
        }
        System.out.println(map);
        result = map.lastKey();
        return result;
    }
    public static void main(String args[]) {
        int[] arr = {1,0,6,4,4,7,2,6,5,9,8,6,3,6,3,2,1,2,7,8};
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i: arr) {
            list.add(i);
        }
        System.out.print(maxOccurences(list));
    }
}
