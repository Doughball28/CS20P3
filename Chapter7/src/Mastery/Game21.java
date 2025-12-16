package Mastery;

public class Game21 
{
	
	    private deck deck = new deck();

	    public hand dealInitialHand() {
	        hand hand = new hand();
	        hand.addCard(deck.dealCard());
	        hand.addCard(deck.dealCard());
	        return hand;
	    }

	    public void dealCardToHand(hand h) {
	        h.addCard(deck.dealCard());
	    }

	    public String determineWinner(hand player, hand computer) {
	        int p = player.getBestValue();
	        int c = computer.getBestValue();

	        if (p > 21) return "You busted! Computer wins.";
	        if (c > 21) return "Computer busted! You win.";
	        if (p > c) return "You win!";
	        if (c > p) return "Computer wins!";
	        return "It's a tie!";
	    }

}
