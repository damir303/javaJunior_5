package lesson20;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("Petya",18);
        Student student2 = new Student("Petya",18);
        Student student3 = new Student("Roma",17);
        Student student4 = new Student("Nastya",15);

        Map<Student,Integer> map = new HashMap<>();

        map.put(student1,5);
        map.put(student2,4);
        map.put(student3,3);
        map.put(student4,2);

        System.out.println(map);

        System.out.println(map.get(student3));
        map.isEmpty();
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.containsKey(student1));

    }
}
