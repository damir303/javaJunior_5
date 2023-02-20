package lesson17.DZ;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UtilsString utilsString = new UtilsString();
        try {
            double[] numbers = utilsString.findNumbers("sdkjbfhj 12ejhb kjabs  asdfj jkb ");
            for (double number : numbers) {
                System.out.println(number);
            }
        } catch (CustomException e) {
            e.printStackTrace();
        }


    }
}
