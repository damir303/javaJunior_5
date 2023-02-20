package lesson12.bilet;

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("����� �� ��������", 2011, "�������", "������ ����", 370);
        Book b2 = new Book("������� ���", 2010, "�������", "������ ����", 345);
        Book b3 = new Book("��������� �����", 2000, "�������", "������ ����", 34563);
        Journal j1 = new Journal("���", 1993, "������-�����", 12, 324);
        Journal j2 = new Journal("������", 1857, "�������", 23, 364345621);

        PrintPublis[] biblioteka = new PrintPublis[5];

        biblioteka[0] = j2;
        biblioteka[1] = b2;
        biblioteka[2] = b3;
        biblioteka[3] = j1;
        biblioteka[4] = b1;

        for (PrintPublis publ : biblioteka) {
            System.out.println(publ.toString());
        }

        System.out.println();
        System.out.println(PrintPublis.printFatPublish(biblioteka));
        System.out.println();
        System.out.println(PrintPublis.printFatBook(biblioteka));
    }

}
