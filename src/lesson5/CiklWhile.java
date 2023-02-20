package lesson5;

public class CiklWhile {
    public static void main(String[] args) {
//        for (int i = 0 ;a>b && b<a ;i++ ){
//            System.out.println("sdjfgis");
//        }

        int j = 4;
        while (j < 4) {
            System.out.println(j);
            j++;
        }

        do {
            System.out.println(j);
        }
        while (j < 4);

    }
}
