package lesson20;


import java.util.Map;
import java.util.TreeMap;

public class StudentTreeMap {
    public static void main(String[] args) {

        Student student2 = new Student("Petya",18);
        Student student3 = new Student("Roma",17);
        Student student4 = new Student("Roma",123);
        Student student5 = new Student("Roma",234);
        Student student6 = new Student("Roma",345);
        Student student7 = new Student("Roma",21);

        Map<Student, Integer> map = new TreeMap<>();
        map.put(student2,5);
        map.put(student3,5);
        map.put(student4,5);
        map.put(student5,5);
        map.put(student6,5);
        map.put(student7,5);
        System.out.println(map);





    }
}
