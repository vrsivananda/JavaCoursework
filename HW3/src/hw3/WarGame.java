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
public class WarGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Create the players
        WarPlayer p1 = new WarPlayer("Matt");
        WarPlayer p2 = new WarPlayer("Nick");
        
        //Create a new deck of cards, shuffle them, and deal to the players
        WarDeck theDeck = new WarDeck();
        theDeck.shuffle();
        theDeck.deal(p1, p2);
        
        //Display the initial hands
        System.out.println("Initial Hands");
        p1.printCards();
        p2.printCards();
        
        //war flag
        boolean isWar = false;
        
        //round Counter
        int roundCounter = 1;
        
        //Create the winner reference
        WarPlayer winner = new WarPlayer("");
        
        //Loop if there are still cards in hand of either player
        while (p1.getHand().size() > 0 && p2.getHand().size() > 0){
            System.out.println("Round " + roundCounter);
            
            //Play the card
            p1.playCard();
            p2.playCard();
            
            if(isWar == true){
                p1.playCard();
                p2.playCard();
                isWar = false;
            }
            
            //Print the cards
            p1.printCards();
            p2.printCards();
            
            //Determine who wins
            int comparison = p1.getTopPileCard().compareTo(p2.getTopPileCard());
            
            //Assign the winner, or war.
            if (comparison == 0){
                System.out.println("War!");
                isWar = true;
                continue;
            }
            else if (comparison == 1){
                winner = p1;
            }
            else if (comparison == -1){
                winner = p2;
            }
            
            roundCounter++;
            
            //Random integer created to determine whose pile is added first
            int randomInteger = (int)(Math.random()*2);
            
            //Winner takes both piles
            if (randomInteger%2 == 0){
               winner.acceptCards(p1.getPile());
               winner.acceptCards(p2.getPile()); 
            }
            else{
               winner.acceptCards(p2.getPile());
               winner.acceptCards(p1.getPile());  
            }
            
            
            //Clear both piles
            p1.clearPile();
            p2.clearPile();
            
            //Print out statements
            System.out.println(winner.getName() + " says: I win.");
            System.out.println(winner.getName() + " took piles.");
            
        }// end of while loop
        
        System.out.println("Game Over!");
        System.out.println(winner.getName() + " wins!");
        
    }//end of main
    
}
