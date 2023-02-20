package lesson14;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Coloda implements IColoda {
    private Card[] coloda;

    public Coloda() {
        coloda = new Card[52];
        coloda[0] = new Card("2 черви", 2);
        coloda[1] = new Card("2 буби", 2);
        coloda[2] = new Card("2 крести", 2);
        coloda[3] = new Card("2 треф", 2);

        coloda[4] = new Card("3 черви", 3);
        coloda[5] = new Card("3 буби", 3);
        coloda[6] = new Card("3 крести", 3);
        coloda[7] = new Card("3 треф", 3);

        coloda[8] = new Card("4 черви", 4);
        coloda[9] = new Card("4 буби", 4);
        coloda[10] = new Card("4 крести", 4);
        coloda[11] = new Card("4 треф", 4);

        coloda[12] = new Card("5 черви", 5);
        coloda[13] = new Card("5 буби", 5);
        coloda[14] = new Card("5 крести", 5);
        coloda[15] = new Card("5 треф", 5);

        coloda[16] = new Card("6 черви", 6);
        coloda[17] = new Card("6 буби", 6);
        coloda[18] = new Card("6 крести", 6);
        coloda[19] = new Card("6 треф", 6);

        coloda[20] = new Card("7 черви", 7);
        coloda[21] = new Card("7 буби", 7);
        coloda[22] = new Card("7 крести", 7);
        coloda[23] = new Card("7 треф", 7);

        coloda[24] = new Card("8 черви", 8);
        coloda[25] = new Card("8 буби", 8);
        coloda[26] = new Card("8 крести", 8);
        coloda[27] = new Card("8 треф", 8);

        coloda[28] = new Card("9 черви", 9);
        coloda[29] = new Card("9 буби", 9);
        coloda[30] = new Card("9 крести", 9);
        coloda[31] = new Card("9 треф", 9);

        coloda[32] = new Card("10 черви", 10);
        coloda[33] = new Card("10 буби", 10);
        coloda[34] = new Card("10 крести", 10);
        coloda[35] = new Card("10 треф", 10);

        coloda[36] = new Card("Король черви", 10);
        coloda[37] = new Card("Король буби", 10);
        coloda[38] = new Card("Король крести", 10);
        coloda[39] = new Card("Король треф", 10);

        coloda[40] = new Card("Дама черви", 10);
        coloda[41] = new Card("Дама буби", 10);
        coloda[42] = new Card("Дама крести", 10);
        coloda[43] = new Card("Дама треф", 10);

        coloda[44] = new Card("Валет черви", 10);
        coloda[45] = new Card("Валет буби", 10);
        coloda[46] = new Card("Валет крести", 10);
        coloda[47] = new Card("Валет треф", 10);

        coloda[48] = new Card("Туз черви", 1);
        coloda[49] = new Card("Туз буби", 1);
        coloda[50] = new Card("Туз крести", 1);
        coloda[51] = new Card("Туз треф", 1);

    }

    @Override
    public Card getRandomCard() {
        Random rand = new Random();
        int r = rand.nextInt(51);

        return coloda[r];
    }
}
