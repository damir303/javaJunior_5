package lesson14;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Coloda implements IColoda {
    private Card[] coloda;

    public Coloda() {
        coloda = new Card[52];
        coloda[0] = new Card("2 �����", 2);
        coloda[1] = new Card("2 ����", 2);
        coloda[2] = new Card("2 ������", 2);
        coloda[3] = new Card("2 ����", 2);

        coloda[4] = new Card("3 �����", 3);
        coloda[5] = new Card("3 ����", 3);
        coloda[6] = new Card("3 ������", 3);
        coloda[7] = new Card("3 ����", 3);

        coloda[8] = new Card("4 �����", 4);
        coloda[9] = new Card("4 ����", 4);
        coloda[10] = new Card("4 ������", 4);
        coloda[11] = new Card("4 ����", 4);

        coloda[12] = new Card("5 �����", 5);
        coloda[13] = new Card("5 ����", 5);
        coloda[14] = new Card("5 ������", 5);
        coloda[15] = new Card("5 ����", 5);

        coloda[16] = new Card("6 �����", 6);
        coloda[17] = new Card("6 ����", 6);
        coloda[18] = new Card("6 ������", 6);
        coloda[19] = new Card("6 ����", 6);

        coloda[20] = new Card("7 �����", 7);
        coloda[21] = new Card("7 ����", 7);
        coloda[22] = new Card("7 ������", 7);
        coloda[23] = new Card("7 ����", 7);

        coloda[24] = new Card("8 �����", 8);
        coloda[25] = new Card("8 ����", 8);
        coloda[26] = new Card("8 ������", 8);
        coloda[27] = new Card("8 ����", 8);

        coloda[28] = new Card("9 �����", 9);
        coloda[29] = new Card("9 ����", 9);
        coloda[30] = new Card("9 ������", 9);
        coloda[31] = new Card("9 ����", 9);

        coloda[32] = new Card("10 �����", 10);
        coloda[33] = new Card("10 ����", 10);
        coloda[34] = new Card("10 ������", 10);
        coloda[35] = new Card("10 ����", 10);

        coloda[36] = new Card("������ �����", 10);
        coloda[37] = new Card("������ ����", 10);
        coloda[38] = new Card("������ ������", 10);
        coloda[39] = new Card("������ ����", 10);

        coloda[40] = new Card("���� �����", 10);
        coloda[41] = new Card("���� ����", 10);
        coloda[42] = new Card("���� ������", 10);
        coloda[43] = new Card("���� ����", 10);

        coloda[44] = new Card("����� �����", 10);
        coloda[45] = new Card("����� ����", 10);
        coloda[46] = new Card("����� ������", 10);
        coloda[47] = new Card("����� ����", 10);

        coloda[48] = new Card("��� �����", 1);
        coloda[49] = new Card("��� ����", 1);
        coloda[50] = new Card("��� ������", 1);
        coloda[51] = new Card("��� ����", 1);

    }

    @Override
    public Card getRandomCard() {
        Random rand = new Random();
        int r = rand.nextInt(51);

        return coloda[r];
    }
}
