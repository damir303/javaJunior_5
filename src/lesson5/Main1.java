package lesson5;

public class Main1 {
    public static void main(String[] args) {
        //��������� ������� ��� ����� ���������
        // ����� 5 �� 6 ���� �� ��������� 1000
        int a = 5;
        int count = 0;
//        for (int i = 5; i < 1000; i = i + 6){
//            count++;
//        }
//        System.out.println(count);

        while (a < 1000) {
            a = a + 6;
            count++;
        }
        System.out.println(count);

        // ����������� ������� �� �������
        double summ = 1000000;
        int platej = 15000;
        double procent = 7.9;
        int m = 0;
        while (summ > 0) {
            m++;

            summ = ((summ * procent) / 100) / 12 + summ - platej;
            System.out.println(summ);
        }
        System.out.println(m);


    }
}
