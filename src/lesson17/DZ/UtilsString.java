package lesson17.DZ;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class UtilsString implements StringUtils {
    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        if (number1 == null || number2 == null) {
            throw new NullPointerException("number1 == 0 || number2 == 0");
        }
        double n1 = 0;
        double n2 = 0;
        try {
            n1 = Double.parseDouble(number1);
        } catch (Exception e) {
            throw new NumberFormatException("number 1 не число");
        }
        try {
            n2 = Double.parseDouble(number2);
        } catch (Exception e) {
            throw new NumberFormatException("number 2 не число");
        }
        if (n2 == 0) {
            throw new ArithmeticException("деление на 0 ");
        }
        return n1 / n2;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {

        try {
            if (text.length() == 0 || word.length() == 0) {
                throw new NullPointerException("Ќет текста или искомого слова");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new NullPointerException("Ќет текста или искомого слова");
        }

        int i = 0;
        List<Integer> ls = new ArrayList<>();
        String st = text;
        String[] list = st.split(" ");
        for (i = 0; i < list.length; i++) {
            if (list[i].equalsIgnoreCase(word)) {
                ls.add(i);
            }
        }


        int[] primitive = ls.stream().mapToInt(Integer::intValue).toArray(); // Ёто € сдул из интернета
        return primitive;
    }


    @Override
    public double[] findNumbers(String text) throws CustomException {
        String[] arr = text.split(" ");
        List<Double> list = new ArrayList<>();
        for (String s : arr) {
            double d;
            try {
                d = Double.parseDouble(s);
                list.add(d);
            } catch (Exception e) {
            }
        }
        if (list.isEmpty()) {
            throw new CustomException("Ќет чисел");
        }

        Double[] doubles = list.toArray(new Double[0]);
        double[] res = new double[doubles.length];

        for (int i = 0; i < doubles.length; i++) {
            res[i] = doubles[i];
        }

        return res;

    }
}
