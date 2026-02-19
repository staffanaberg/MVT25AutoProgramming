package diceGame;

public class Player {



    private String name;
    private int score;


    public Player(String name) {
        this.name = name;
        score = 0;
    }

    public String getName() {
        return name;
    }

    public void changeScore(int score) {
        this.score += score;
    }

    public int getScore() {
        return score;
    }

    public boolean isWinner() {

        /*if(score>=50) {
            return true;
        } else {
            return false;
        }*/

        return score>=50;
    }
}
