package lesson9;

public class Main {
    public static void main(String[] args) {
        Treugolnik // �����
                tre // ������ ������
                = new Treugolnik(); //�������� ������� ������

        //����
        //��������������
        //�������

        tre.setA(3123);
        tre.setB(4);
        tre.setC(5);

        int perimetr = tre.perimetr();
        System.out.println("�������� = " + perimetr);

        int aa = tre.getA();
        int bb = tre.getB();
        int cc = tre.getC();

        System.out.println(aa + " " + bb + " " + cc);

    }
}
