package lesson21;

import java.util.*;

public class Shop {
    public static void main(String[] args) {
        //���������� �� ��������
        Tovar tovar = new Tovar("�����", "�������� ����� �����!", 200);
        Tovar tovar1 = new Tovar("�������", "����� ������� �������", 10000);
        Tovar tovar2 = new Tovar("�������", "������� �� ����� ����������!", 8000);
        Tovar tovar3 = new Tovar("�����", "������������ ����� ������!", 12000);
        Tovar tovar4 = new Tovar("�����", "����� ����� �� �������!", 5000);

        Otziv otziv = new Otziv(5, "������� �����");
        Vopros vopros = new Vopros("qwe", "qweqwe");
        tovar.setOtzivs(otziv);
        tovar.setVopros(vopros);

        Otziv otziv1 = new Otziv(5, "������� �������");
        Vopros vopros1 = new Vopros("������� �������", "������� �������");
        tovar1.setOtzivs(otziv1);
        tovar1.setVopros(vopros1);

        Otziv otziv2 = new Otziv(4, "�������2");
        Vopros vopros2 = new Vopros("�������", "�������2");
        tovar2.setOtzivs(otziv2);
        tovar2.setVopros(vopros2);

        Otziv otziv3 = new Otziv(1, "����� �����");
        Otziv otziv31 = new Otziv(5, "������� �����");
        Vopros vopros3 = new Vopros("�����", "�����");
        tovar3.setOtzivs(otziv3);
        tovar3.setOtzivs(otziv31);
        tovar3.setVopros(vopros3);

        Otziv otziv4 = new Otziv(5, "����");
        Vopros vopros4 = new Vopros("����", "����");
        tovar4.setOtzivs(otziv4);
        tovar4.setVopros(vopros4);

        Set<Tovar> tovarSet = new TreeSet<>();
        tovarSet.add(tovar);
        tovarSet.add(tovar1);
        tovarSet.add(tovar2);
        tovarSet.add(tovar3);
        tovarSet.add(tovar4);

        for (Tovar tovars : tovarSet) {
            System.out.println(tovars);
        }
        System.out.println();

        Set<Tovar> tovarSet1 = new TreeSet<>(new SortByPryceFromTo());
        tovarSet1.addAll(tovarSet);

        for (Tovar tovars : tovarSet1) {
            System.out.println(tovars);
        }

        System.out.println();
        Set<Tovar> tovarSet2 = new TreeSet<>(new Comparator<Tovar>() {
            @Override
            public int compare(Tovar o1, Tovar o2) {

                if (!o1.getName().equals(o2.getName())) {
                    return o1.getName().compareTo(o2.getName());
                }
                if (o1.getPrice() != o2.getPrice()) {
                    return o1.getPrice() - o2.getPrice();
                }
                if (!o1.getOpis().equals(o2.getOpis())) {
                    return o1.getOpis().compareTo(o2.getOpis());
                }
                return 0;
            }
        });
        tovarSet2.addAll(tovarSet);

        for (Tovar tovars : tovarSet2) {
            System.out.println(tovars);
        }

        System.out.println();

        Set<Tovar> tovarSet3 = new TreeSet<>((o1, o2) -> {
            if (!o1.getName().equals(o2.getName())) {
                return o1.getName().compareTo(o2.getName());
            }
            if (o1.getPrice() != o2.getPrice()) {
                return o1.getPrice() - o2.getPrice();
            }
            if (!o1.getOpis().equals(o2.getOpis())) {
                return o1.getOpis().compareTo(o2.getOpis());
            }
            return 0;
        });
        tovarSet3.addAll(tovarSet);

        for (Tovar tovars : tovarSet3) {
            System.out.println(tovars);
        }

        System.out.println();

        Set<Tovar> tovarRate = new TreeSet<>((o1, o2) -> {
            if (o1.getAverageRate() != o2.getAverageRate()) {
                //return (int) (o1.getAverageRate() - o2.getAverageRate());
                // 4.5 - 4.3 =  (int)0.2 = 0
                return Double.compare(o1.getAverageRate(), o2.getAverageRate());

            }
            if (!o1.getName().equals(o2.getName())) {
                return o1.getName().compareTo(o2.getName());
            }
            if (o1.getPrice() != o2.getPrice()) {
                return o1.getPrice() - o2.getPrice();
            }
            if (!o1.getOpis().equals(o2.getOpis())) {
                return o1.getOpis().compareTo(o2.getOpis());
            }
            return 0;
        });
        tovarRate.addAll(tovarSet);

        for (Tovar tovars : tovarRate) {
            System.out.println(tovars);
        }

    }
}
