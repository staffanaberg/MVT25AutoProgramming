package diceGame;

import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Hur många spelare är ni? (1-4)");
        int nbr = Integer.parseInt(scan.nextLine());

        Player[] players = new Player[nbr];

        for(int i=0;i< players.length;i++) {
            System.out.println("What is your name?");
            String name = scan.nextLine();
            players[i] = new Player(name);
        }


        int i = nbr-1;

        //1, 2, 3, 0, 1, 2

        while(!players[i].isWinner()) {
            i++;
            i = i%nbr;
            int dice = 0;
            boolean save = false;
            int currentScore = 0;
            System.out.println("");
            System.out.println(players[i].getName() +" your total score is: " + players[i].getScore());

            while (dice != 1 && !save) {

                dice = Dice.roll();
                currentScore += dice;
                System.out.println("Let's roll the dice!");
                System.out.println("You rolled: " + dice);
                System.out.println("Current score: " + currentScore);

                if (dice > 1) {
                    save = Save.askToSave(scan);
                } else {
                    System.out.println("Sorry you lost your current score");
                    currentScore = 0;
                }
            }

            players[i].changeScore(currentScore);
            System.out.println("Your new total score is: " + players[i].getScore());
        }

        System.out.println(players[i].getScore());
        System.out.println(players[i].getName());

    }

}
