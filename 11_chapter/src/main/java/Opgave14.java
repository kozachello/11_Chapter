import java.util.HashMap;
import java.util.Map;

/**
 * Created by Козак on 20.09.2016.
 */
public class Opgave14 {

    public static Map<String, Integer> intersect(Map<String, Integer> first, Map<String, Integer> second) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(Map.Entry<String, Integer> one: first.entrySet()) {
            for(Map.Entry<String, Integer> two: second.entrySet()) {
                if(one.equals(two)) {
                    map.put(one.getKey(), one.getValue());
                }                       //  F
            }                           //  L
        }                               //  O
        return map;                     //  T
    }                                   //  :=))

    public static void main(String args[]) {
        Map<String, Integer> first = new HashMap<String, Integer>();
        Map<String, Integer> second = new HashMap<String, Integer>();
        first.put("Adam", 23);
        first.put("Billy", 30);
        first.put("David", 28);
        first.put("Hanna", 24);
        first.put("Robert", 26);
        second.put("Adam", 23);
        second.put("Billy", 31);
        second.put("David", 28);
        second.put("Hanna", 24);
        second.put("Willy", 26);
        System.out.println(intersect(first, second));
    }
}
