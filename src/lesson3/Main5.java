package lesson3;

public class Main5 {
    public static void main(String[] args) {
        char[] c = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p','A'};
        //Вывести на консоль только гласные
        // «A», «E», «I», «O», «U», «Y»


        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i'
                    || c[i] == 'o' || c[i] == 'u' || c[i] == 'y') {
                System.out.println(c[i]);
            }
        }
        System.out.println();

        char[] glass = {'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y'};

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < glass.length; j++) {
                if (c[i] == glass[j]) {
                    System.out.println(c[i]);
                }
            }
        }


    }
}
