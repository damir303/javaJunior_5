package lesson20;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("12");
        arrayList.set(0,"weqwe");


        HashMap<String, Integer> map1  = new HashMap<>();

        map1.putIfAbsent("�����",55);
        map1.put("�����",45);
        map1.put("����",33);
        System.out.println(map1);
        System.out.println();

        map1.putIfAbsent("�����",66);

        map1.put(null,438);
        map1.putIfAbsent(null,124443);
        System.out.println(map1);




    }
}
