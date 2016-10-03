import java.util.*;

/**
 * Created by Козак on 23.09.2016.
 */
public class Opgave13 {
    public static boolean isUnique(Map<String, String> map) {
        String value;
        boolean check = false;
        Collection<String> coll = map.values();
        Collection<String> values = new ArrayList<String>();
        Iterator<String> it = coll.iterator();
        while(it.hasNext()) {
            value = it.next();
            if(!values.contains(value)) {
                values.add(value);
            } else check = true;
        }
        return check;
    }
    public static void main(String args[]) {
        Map<String, String> first = new HashMap<String, String>();
        Map<String, String> second = new HashMap<String, String>();
        first.put("James", "Johnson");
        first.put("Johny", "Cage");
        first.put("Sam", "Winston");
        second.put("Alex", "Kozak");
        second.put("Will", "Simpson");
        second.put("Arnold", "Simpson");
        System.out.println(isUnique(first));
        System.out.print(isUnique(second));
    }

}
