package Mastery;

public class exercise4 
{
    private die die1;
    private die die2;
    private int score;

    public exercise4() {
        die1 = new die();
        die2 = new die();
        score = 1000;
    }

    public int getScore() {
        return score;
    }

    public int rollDice() {
        die1.roll();
        die2.roll();
        return die1.getValue() + die2.getValue();
    }

    public void win(int points) {
        score += points;
    }

    public void lose(int points) {
        score -= points;
    }
}
