package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int constPlayers = 6;
        int staminaStartsMin = 90;
        Random random = new Random();
        Player[] players = new Player[constPlayers];


        while (Player.getCountPlayers() < constPlayers) {

            int staminaStarts = random.nextInt(Player.MAX_STAMINA - staminaStartsMin + 1) + staminaStartsMin;
            players[Player.countPlayers] = new Player(staminaStarts);
          //  System.out.println("новый игрок " + players[Player.countPlayers - 1].getStamina() + " " + Player.countPlayers);
          //  Player.info();
        }

        while (players[0].getStamina() > 0) {// можно запустить со случайным индесом
            players[0].run();
        }

        Player.info();


    }


}

