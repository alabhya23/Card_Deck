//Deck.java

import java.util.*;
class Deck{
	ArrayList<Card> deck;  //Card is the object of card.java
	
	public Deck(){
		this.deck = new ArrayList<>();
	}
	
	public void createDeck(){    //deck of cards
		String[] ranks = {"2","3","4","5","6","7","8","9","10","Q","K","J","A"};
		String[] suits = {"Clubs","Spades","Diamonds","Hearts"};
		
		for (String rank : ranks){
			for (String suit :suits){
				deck.add(new Card(rank,suit));
			}
		}
	}
	public void displayDeck(){
		for(Card card : deck){
			System.out.println(card);
		}
	}
	public void shuffleDeck(){
		Collections.shuffle(deck);
	}
	public void randomCards() {
        // Select two random cards from the deck
        Random random = new Random();
        
        if (deck.size() >= 2) {
            Card card1 = deck.get(random.nextInt(deck.size()));
            Card card2 = deck.get(random.nextInt(deck.size()));
           
            while (card1.equals(card2)) {
                card2 = deck.get(random.nextInt(deck.size()));
            }
            
            System.out.println("Selected Cards:");
            System.out.println("1. " + card1);
            System.out.println("2. " + card2);
        } else {
            System.out.println("Not enough cards in the deck!");
        }
    }
	public void players() {
		shuffleDeck(); // Shuffle before distributing

        // Creating lists for each player
        ArrayList<Card> player1 = new ArrayList<>();
        ArrayList<Card> player2 = new ArrayList<>();
        ArrayList<Card> player3 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            player1.add(deck.remove(0));
            player2.add(deck.remove(0));
            player3.add(deck.remove(0));
        }

        System.out.println("Player 1's cards: " + player1);
        System.out.println("Player 2's cards: " + player2);
        System.out.println("Player 3's cards: " + player3);
    }
    // Find a specific card in the deck
    public boolean findCard(String rank, String suit) {
        for (Card card : deck) {
            if (card.rank.equalsIgnoreCase(rank) && card.suit.equalsIgnoreCase(suit)) {
                return true;
            }
        }
        return false;
    }
    // Check if two cards belong to the same suit
    public boolean sameCard(Card c1, Card c2) {
        return c1.suit.equals(c2.suit);
    }

    // Check if two cards have the same rank
    public boolean compareCard(Card c1, Card c2) {
        return c1.rank.equals(c2.rank);
    }

}

//3 player 5 cards randomly
