import java.util.*;

/**
 * Created by Козак on 20.09.2016.
 */
public class Opgave16 {
    public static boolean notSame(Map<String, Integer> map) {
        Collection<Integer> coll = map.values();
        ArrayList<Integer> values = new ArrayList<Integer>();
        Iterator<Integer> it = coll.iterator();
        boolean check = true;
        int control = 0;
        int value;
        while(it.hasNext()) {
            value = it.next();
            if(values.contains(value)) {
                control++;
            } else values.add(value);
        }
        if(control>0) {
            check = false;
        }
        return check;
    }
    public static void main(String args[]) {
        Map<String, Integer> first = new HashMap<String, Integer>();
        Map<String, Integer> second = new HashMap<String, Integer>();
        second.put("Alex", 120-4556);
        second.put("Max", 120-4580);
        second.put("Eddie", 120-4510);
        first.put("Alex", 120-4510);
        first.put("Max", 120-4580);
        first.put("Eddie", 120-4510);
        System.out.println(notSame(first));
        System.out.print(notSame(second));
    }
}
