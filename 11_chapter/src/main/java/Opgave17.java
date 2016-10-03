import java.util.HashMap;
import java.util.Map;

/**
 * Created by Козак on 20.09.2016.
 */
public class Opgave17 {
    public static boolean subMap(Map<String, String> first, Map<String, String> second) {
        boolean check = false;
        int control = 0;
        int flag;
        if(first.size()<=second.size()) {
            flag = 0;
            for(Map.Entry<String, String> me: first.entrySet()) {
                if(second.containsKey(me.getKey()) && second.containsValue(me.getValue())) {
                    control++;
                }
            }
        } else {
            flag = 1;
            for(Map.Entry<String, String> me: second.entrySet()) {
                if(first.containsKey(me.getKey()) && first.containsValue(me.getValue())) {
                    control++;
                }
            }
        }
        if(flag==0) {
            if(control>=first.size()) {
                check = true;
            }
        } else {
            if(control>=second.size()) {
                check = true;
            }
        }
        return check;
    }

    public static void main(String args[]) {
        Map<String, String> first = new HashMap<String, String>();
        Map<String, String> second = new HashMap<String, String>();
        first.put("Adam", "949-0504");
        first.put("Billy", "949-0608");
        first.put("David", "949-0301");
        second.put("Adam", "949-0504");
        second.put("Billy", "949-0608");
        second.put("David", "949-0301");
        second.put("Hanna", "949-0201");
        second.put("Willy", "949-0902");
        System.out.println(subMap(first, second));
    }
}
