package lesson5;

public class Sslocnie extends Object {
    public static void main(String[] args) {
        String h = "Hello world";
        String H1 = "He";
        String h2 = "llo";
        String l = H1 + h2;

        System.out.println(h);
        System.out.println(l);
        System.out.println(h == l);
        System.out.println(h.equals(l));

        Integer b = 56;
        String c = H1.concat(b.toString());
        System.out.println(c);

        String j = String.join("", H1, h2, "sdf");
        System.out.println(j);

        h = h.toUpperCase();
        System.out.println(h);
        int a = 56;

        String s3 = H1 + b;
        System.out.println(s3);

        String ja = "Hello Java";
        char sdf = ja.charAt(4);
        System.out.println(sdf);

        for (int i = 0; i < ja.length(); i++) {
            System.out.println(ja.charAt(i));
        }
        char[] arr = ja.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        String jaa = "Hello Java";
        int j1 = jaa.indexOf('J');
        int java = jaa.indexOf("llo Ja");

        System.out.println(j1);
        System.out.println(java);

        System.out.println(jaa.replace('a', 'A'));
        System.out.println(jaa.replace("Hello", "Bye"));
        jaa.toUpperCase();


        /*
        дл€ текста
“ак как в самом начале StringBuffer инициализируетс€ строкой "Java", то его емкость составл€ет 4 + 16 = 20 символов. «атем мы увеличиваем емкость буфера с помощью вызова strBuffer
        1) посчитать количество букв без пробела
        2) посчитать количество английских букв
        3) все цифры заменить на звездочку (*)
        4) после каждой точки или зап€той перходить на новую строчку
        5)вывести все с заглавной буквы
        6)(***) вывести каждое второе слово


         */


    }
}
