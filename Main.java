//Main.java

import java.util.*;

class Main{
	public static void main(String args[]){
		Deck deck = new Deck();
        Scanner scanner = new Scanner(System.in);
		{
		System.out.println("***********Creating Deck*************");
		deck.createDeck();
		System.out.println("***********Printing Deck*************");
		deck.displayDeck();
		System.out.println("***********Shuffling Deck*************");
		deck.shuffleDeck();
		deck.displayDeck();
		System.out.println("***********Random two card Deck*************");
		deck.randomCards();
		System.out.println("***********Player with five cards from Deck*************");
		deck.players();
		System.out.print("Enter rank of card: ");
        String rank = scanner.next();
        System.out.print("Enter suit of card: ");
        String suit = scanner.next();
        boolean found = deck.findCard(rank, suit);
        System.out.println(found ? "Card found in deck!" : "Card not found in deck.");
		System.out.println("*********** Comparing Two Cards by Suit *************");
        deck.shuffleDeck();
        Card card1 = deck.deck.get(0);
        Card card2 = deck.deck.get(1);
        System.out.println("Card 1: " + card1);
        System.out.println("Card 2: " + card2);
        System.out.println(deck.sameCard(card1, card2) ? "Both cards have the same suit." : "Cards have different suits.");
        System.out.println("*********** Comparing Two Cards by Rank *************");
        deck.shuffleDeck();
        card1 = deck.deck.get(0);
        card2 = deck.deck.get(1);
        System.out.println("Card 1: " + card1);
        System.out.println("Card 2: " + card2);
        System.out.println(deck.compareCard(card1, card2) ? "Both cards have the same rank." : "Cards have different ranks.");
        System.out.println("Exiting program...");
        scanner.close();
		}
	}
}
