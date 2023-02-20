package lesson9;

/*
String[][] db = {
        // страна, стоимость, сколько добираться, звезд,     на чем
        {"Турция", "50000", "3", "4 звезды", "самолет"},
        {"Турция", "80000", "4", "5 звезд", "самолет"},
        {"Египет", "70000", "6", "3 звезды", "самолет"},
        {"ОАЭ", "120000", "5", "4 звезды", "самолет"},
        {"Кипр", "100000", "4", "4 звезды", "самолет"},
        {"Сочи", "50000", "12", "2 звезды", "автобусе"},
        {"Байкал", "100000", "24", "4 звезды", "поезде"},
        {"германия", "60000", "15", "5 звезд", "поезде"}
};
 */
public class TurUtils {
    public static void printTurByCountry(String[][] turs, String coutry) {
        for (int i = 0; i < turs.length; i++) {
            if (turs[i][0].equals(coutry)) {
                System.out.printf("Тур: %s, Стоимость %s, добираться %s, %s, добираться на %s\n",
                        turs[i][0], turs[i][1], turs[i][2], turs[i][3], turs[i][4]);
            }
        }
    }

    public static String[][] turByCountryAndPrice
            (String[][] turs, String country, int from, int to) {
        String[][] temp = new String[turs.length][turs[0].length];
        int count = 0;
        for (int i = 0; i < turs.length; i++) {
            if (turs[i][0].equals(country) &&
                    (from < Integer.parseInt(turs[i][1])
                            || Integer.parseInt(turs[i][1]) > to)) {
                for (int t = 0; t < temp.length; t++) {
                    if (temp[t][0] == null) {
                        temp[t] = turs[i];
                        count++;
                        break;
                    }
                }
            }
        }
        String[][] res = new String[count][turs[0].length];
        for (int j = 0; j < res.length; j++) {
            res[j] = temp[j];
        }

        return res;
    }
}
