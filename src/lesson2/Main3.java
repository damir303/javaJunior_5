package lesson2;

public class Main3 {
    public static void main(String[] args) {
        // ввевести все числа от 20 до включительно 30

        for (int i = 20; i < 31; i++) {
            System.out.println(i);
        }
        // выевести числа от 150 до 100
        for (int i = 150; i > 100; i--) {
            System.out.println(i);
        }
        System.out.println();
        // вывести числа от 10 до 50 кадое третье число
        for (int i = 10; i < 50; i = i + 3) {
            System.out.println(i);
        }
        System.out.println();
        for (int i = 10; i < 50; i++) {
            if ((i + 2) % 3 == 0)
                System.out.println(i);
        }

        //вывести числа от 100 до 500 которые делятся на 4 и 7
        System.out.println();
        for (int i = 100; i < 500; i++) {
//            if (i % 4 == 0 && i % 7 == 0) {
//                System.out.println(i);
//            }
            if (i % (4 * 7) == 0) {
                System.out.println(i);
            }
        }

        //вывести количество чисел от 100 до 500 которые делятся на 4 и 7
        System.out.println();
        int kol = 0;
        for (int i = 100; i < 500; i++) {
            if (i % 4 == 0 && i % 7 == 0) {
                kol++;
            }
        }

        System.out.println(kol);


        // вывест количество четных нечетных и которые делятся на 5
        // от 0 до 100
        int chet = 0;
        int nechet = 0;
        int five = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                chet++;
            } else {
                nechet++;
            }
            if (i % 5 == 0) {
                five++;
            }
        }
        System.out.println(chet);
        System.out.println(nechet);
        System.out.println(five);


    }
}
