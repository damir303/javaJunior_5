package lesson3;

public class DZ2 {
    public static void main(String[] args) throws InterruptedException {
        int h = 3;

        for (int i = 0; i < h; i++) {
            for (int m = 0; m < 6; m++) {
                for (int s = 0; s < 6; s++) {
                    System.out.println("Прошло " + i + " Часов "
                            + m + " Миинут " + s + " секунд");
                    //Thread.sleep(1000);
                }
            }
        }
    }
}
