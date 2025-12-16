package Mastery;
import java.util.ArrayList;
public class hand {

	    private ArrayList<card> cards = new ArrayList<>();

	    public void addCard(card c) {
	        cards.add(c);
	    }

	    public int getBestValue() {
	        int total = 0;
	        int aces = 0;

	        for (card c : cards) {
	            total += c.getValue();
	            if (c.getRank() == 1) aces++;
	        }

	        // Adjust Ace values from 11 to 1 if needed
	        while (total > 21 && aces > 0) {
	            total -= 10;
	            aces--;
	        }

	        return total;
	    }

	    public String toString() {
	        return cards.toString() + " (Total: " + getBestValue() + ")";
	    }
}

