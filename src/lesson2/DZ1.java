package lesson2;

public class DZ1 {
    public static void main(String[] args) {

//        � ������� ����� For, ���������� �� �������:
//1) ������ ������ �� -100 �� -50
//2) ��� ����� � �������� ������� �� 10 �� 30
//3) ���-�� ������ ����� � ��������� �� 30 �� 61
//4) ������� �� ������� ��� ����� �� 20 �� 60, ��������� �������� �� 30 �� 40 ������������
//5) ** ��������� ������� ����� ���, ���� ������� ����� � 200� ������,
// ���� ����������� ���������� �� 9500;
//
//6)*** ���� ��� ����� (a,b).  a ������ b. ����� ���������, ������� ��� ����� ��������
// �� 2 ����� b ����� ��� ��� ������ �:

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
//            System.out.println(year + " ����");
//        } else {
//            System.out.println(year + 1);
//            System.out.println(year + " ��� � " + (monfh % 12) + " �������");
//        }


    }
}


