package lesson5;

public class DZ1 {
    public static void main(String[] args) {
        String text = "/*Так как в самом начале StringBuffer инициализируется строкой \"Java\", то его емкость составляет 4 + 16 = 20 символов. Затем мы увеличиваем емкость буфера с помощью вызова strBuffer */";
        //1) посчитать количество букв
        String s = text.replaceAll("[a..zA-Zа-яА-Я]", "");

        System.out.println(s);
        System.out.println(text.length() - s.length());
        text.replace(" ","");


        int letter = 0;
        for (char c : text.toCharArray()) {
            if (c >= 65 || c >= 90 || c >= 97 || c >= 122) {
                letter++;
            }
        }
        System.out.println("В тексте " + letter + " букв без пробела.");


    }
}
