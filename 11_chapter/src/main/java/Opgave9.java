import java.util.*;
/**
 * Created by Козак on 10.09.2016.
 */
public class Opgave9 {

    public static boolean hasEven(Set<Integer> set) {

        int a;
        //boolean check = true;
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()) {
            a = it.next();
            if(a%2==0) {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]) {

        Set<Integer> set = new TreeSet<Integer>();
        for(int i=3; i<20; i+=7) {
            set.add(i);
        }
        System.out.print(hasEven(set));
    }
}
