package lesson15;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        LinkedList<String> lin = new LinkedList<>();


        long a1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arr.add(0, "qweq" + i);
        }
        long a2 = System.currentTimeMillis();
        System.out.println(a2 - a1);
        long l1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            lin.add(0, "qweq" + i);
        }

        long l2 = System.currentTimeMillis();
        System.out.println(l2 - l1);

        long aa1 = System.currentTimeMillis();
        for (int i = 0; i < 100; i ++) {
            arr.get(i);
        }
        long aa2 = System.currentTimeMillis();
        System.out.println(aa2 - aa1);
        long ll1 = System.currentTimeMillis();
        for (int i = 0; i < 100; i ++) {
            lin.get(i);
        }
        long ll2 = System.currentTimeMillis();
        System.out.println(ll2 - ll1);
    }
}
