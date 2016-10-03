import java.util.*;

/**
 * Created by Козак on 21.09.2016.
 */
public class Opgave18 {
    public static Map<String, String> reverse(Map<String, String> map) {
        Map<String, String> newmap = new HashMap<String, String>();
        for(Map.Entry<String, String> me: map.entrySet()) {
            String value = me.getValue();
            String key = me.getKey();
            newmap.put(value, key);
        }
        return newmap;
    }
    public static void main(String args[]) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("34", "willy");
        map.put("35", "johny");
        map.put("29", "roger");
        map.put("27", "kevin");
        map.put("30", "viggo");
        System.out.print(reverse(map));
    }
}

