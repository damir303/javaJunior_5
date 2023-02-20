package lesson14;

import java.util.ArrayList;

public class Game implements IGame {
    private Coloda coloda = new Coloda();
    private ArrayList<Player> players = new ArrayList<>();

    @Override
    public void addNewPlayer(Player player) {
        players.add(player);
    }

    @Override
    public boolean startGame() {
        return false;
    }

    @Override
    public void dealPlayerCards() {
        for (Player player : players) {
            player.addCardToHand(coloda.getRandomCard());
            player.addCardToHand(coloda.getRandomCard());
        }
    }

    @Override
    public void dealMainRound() {
        for (Player player : players) {
            while (player.needMoreCard()) {
                player.addCardToHand(coloda.getRandomCard());
            }
        }
    }

    @Override
    public void printWinner() {
        for (Player qwe : players) {
            if (qwe.getValues() > 21) {
                qwe.setWinner(false);
            }
        }
        if (contGamePlayer() == 0) {
            for (Player player : players) {
                if(player instanceof Deller){
                    System.out.println("Победил диллер");
                    player.getValues();
                    player.openHand();
                }

            }

        } else if (contGamePlayer() == 1) {
            for (Player player : players) {
                if (player.isWinner()) {
                    System.out.println(player);
                    player.getValues();
                    player.openHand();
                }
            }
        } else if (contGamePlayer() > 1) {
            int winValue = 0;
            for (Player p : players) {
                if (p.isWinner() && winValue < p.getValues()) {
                    winValue = p.getValues();
                }
            }
            for (Player player : players) {
                if (winValue == player.getValues()) {
                    System.out.println(player+" Победитель!");
                    player.getValues();
                    player.openHand();
                }
                else {
                    if (winValue != player.getValues()) {
                        System.out.println(player+" Проигравшие!");
                        player.getValues();
                        player.openHand();
                    }
                }
            }

        }
    }

    private int contGamePlayer() {
        int i = 0;
        for (Player player : players) {
            if (player.isWinner()) {
                i++;
            }
        }
        return i;
    }
}
