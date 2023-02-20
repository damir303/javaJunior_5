package lesson2;

public class DZ1 {
    public static void main(String[] args) {

//        С помощью цикла For, напечатать на консоль:
//1) Только четные от -100 до -50
//2) Все числа в обратном порядке от 10 до 30
//3) Кол-во четных чисел в диапазоне от 30 до 61
//4) Вывести на консоль все числа от 20 до 60, пропуская диапазон от 30 до 40 включительно
//5) ** Посчитать сколько нужно лет, чтоб собрать сумму в 200т рублей,
// если откладывать ежемесячно по 9500;
//
//6)*** Даны два числа (a,b).  a больше b. нужно посчитать, сколько раз нужно умножить
// на 2 число b чтобы тот был больше а:

        int a = 44;
        int b = 5;
        int count = 0;
        for (int i = b; b < a; i = i * 2) {
            b = i;
            count++;
            System.out.println(b);
        }

        System.out.println(count);


//        int monfh = 0;
//
//        for (int i = 0; i < 220000; i = i + 9500) {
//            monfh++;
//        }
//        System.out.println(monfh);
//
//        int year = monfh / 12;
//        if (monfh % 12 == 0) {
//            System.out.println(year + " Года");
//        } else {
//            System.out.println(year + 1);
//            System.out.println(year + " Лет и " + (monfh % 12) + " Месяцев");
//        }


    }
}


