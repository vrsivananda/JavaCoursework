/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3;

/**
 *
 * @author vrsiv
 */
public class WarTester {
    
    public static void main(String args[]){
        //Testing the constructors and methods
        System.out.println("============================================");
        System.out.println("Testing the WarCard Class");
        
        WarCard a = new WarCard(0);
        WarCard b = new WarCard(2);
        WarCard c = new WarCard(45);
        WarCard d = new WarCard(51);
        
        System.out.println("Success if prints out the 4 WarCards above, with the first being Two of Diamonds and the last being Ace of Spades");
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(d.toString());

        a.compareTo(b);
        c.compareTo(a);
        d.compareTo(c);

        
        System.out.println("Success if prints out WarCards ranks from 2 to Ace,");
        System.out.println("and within each rank in the order of Diamond, Club, Heart, Spade");
        for (int i = 0; i<=51; i++){
            WarCard x = new WarCard(i);
            System.out.println(x.toString());
        }
        
        System.out.println("============================================");
        System.out.println("Testing the WarDeck Class");
        
        WarDeck theDeck = new WarDeck();
        System.out.println("Before Shuffling:::::::::::");
        theDeck.print();
        theDeck.shuffle();
        System.out.println("After Shuffling:::::::::::");
        theDeck.print();
        
        
        System.out.println("============================================");
        System.out.println("Testing the WarPlayer Class");
        
        
        WarPlayer p1 = new WarPlayer("Matt");
        WarPlayer p2 = new WarPlayer("Nick");
        System.out.println("");
        System.out.println("Success if prints out empty pile and hand:");
        p1.printCards();
        p2.printCards();
        
        p1.acceptCard(a);
        p2.acceptCard(d);
        System.out.println("");
        System.out.println("Success if both have empty piles, ");
        System.out.println("and Matt has (2 of Diamonds) and Nick has (A of Spades) in hand:");
        p1.printCards();
        p2.printCards();
        
        WarDeck theDeck2 = new WarDeck();
        theDeck2.deal(p1, p2);
        System.out.println("");
        System.out.println("Success if the first card in the hand is now in the pile.");
        p1.printCards();
        p2.printCards();
        
        p1.playCard();
        p2.playCard();
        System.out.println("");
        System.out.println("Success if both have alternate cards in hand since the deck is not shuffled yet. (Plus the card accepted above.)");
        p1.printCards();
        p2.printCards();
        
        //Nick should win
        if (p1.getTopPileCard().compareTo(p2.getTopPileCard()) == -1){
            p2.acceptCards(p1.getPile());
            p2.acceptCards(p2.getPile());
            p1.clearPile();
            p2.clearPile();
        }
        System.out.println("");
        System.out.println("Success if both piles are empty and Matt now has the cards from the pile added to his hand.");
        p1.printCards();
        p2.printCards();
      
        
    }
    
}
