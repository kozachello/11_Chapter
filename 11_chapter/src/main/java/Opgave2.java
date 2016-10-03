import java.util.*;
/**
 * Created by Козак on 07.09.2016.
 */

public class Opgave2 {

    public static ArrayList<Integer> alternate(ArrayList<Integer>list1, ArrayList<Integer>list2) {

        int size1 = list1.size();
        int size2 = list2.size();
        int size = size1 + size2;
        int element;
        int a = 0;
        ArrayList<Integer> newlist = new ArrayList<Integer>();

        try {
            for (int i = 0; i < size; i++) {
                if(i<size1) {
                    element = list1.get(i);
                    newlist.add(i+a, element);
                    a++;
                }
                if(i<size2) {
                    element = list2.get(i);
                    newlist.add(i+a, element);
                }
            }
        } catch(NoSuchElementException ex1) {
            System.out.print("ERROR! " +ex1);
        } catch(IndexOutOfBoundsException ex2) {
            System.out.print("ERROR! " +ex2);
        }
        return newlist;

    }

    public static void main(String args[]) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for(int i=1; i<6; i++) {
            list1.add(i);
        }
        for(int j=6; j<13; j++) {
            list2.add(j);
        }
        ArrayList<Integer> newlist = alternate(list1, list2);
        System.out.print(newlist);

    }
}

