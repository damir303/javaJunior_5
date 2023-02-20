package lesson17;

public class Main {
    public static void main(String[] args) {
        Avtobus a = new Avtobus();

        try {
            a.setDriver(200);
        }
        catch (ArithmeticException e){
            System.out.println("Не дури");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("действие закночилось");
        }


        //1) создавался обьект exeptions
        //2) Делался вывод стека(printStackTrace)
        //3) прерывание кода





        System.out.println("Конец");
    }
}
