package lesson17;

public class Main {
    public static void main(String[] args) {
        Avtobus a = new Avtobus();

        try {
            a.setDriver(200);
        }
        catch (ArithmeticException e){
            System.out.println("�� ����");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("�������� �����������");
        }


        //1) ���������� ������ exeptions
        //2) ������� ����� �����(printStackTrace)
        //3) ���������� ����





        System.out.println("�����");
    }
}
