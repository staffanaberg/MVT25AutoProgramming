package diceGame;

import java.util.Scanner;

public class Save {

    public static boolean askToSave(Scanner scan) {
        System.out.println("Do you want to save your score? (y/n)");
        String answer = scan.nextLine();
        if(answer.equals("y") || answer.equals("yes")) {
            return true;
        } else {
            return false;
        }
    }

}
