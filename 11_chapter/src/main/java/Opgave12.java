import java.util.*;

/**
 * Created by Козак on 17.09.2016.
 */
public class Opgave12 {

    public static boolean containsThree(ArrayList<String> list) {
        ArrayList<String> newlist = new ArrayList<String>();
        ArrayList<Integer> controllist = new ArrayList<Integer>();
        boolean check = false;
        int control = 0;
        int count;
        String word;
        ListIterator<String> it = list.listIterator();
        try {
            while (it.hasNext()) {
                word = it.next();
                if (!newlist.contains(word)) {
                    newlist.add(word);
                } else {
                    count = list.indexOf(word);
                    controllist.add(count);
                }
            }
        } catch(ConcurrentModificationException ex) {
            System.out.print("You are trying to modificate list while iteration in process! ");
        }
        if(control>2) {
            check = true;
        }
        return check;
    }

    public static void main(String args[]) {
        String[] countries = {"Italy", "France", "Russia", "Russia", "Italy", "Denmark", "USA", "Russia"};
        ArrayList<String> list = new ArrayList<String>();
        for(String str: countries) {
            list.add(str);
        }
        System.out.print(containsThree(list));
    }
}
