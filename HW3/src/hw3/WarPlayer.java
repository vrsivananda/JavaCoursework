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
import java.util.ArrayList;

public class WarPlayer {
    private String name;
    private ArrayList<WarCard> hand;
    private ArrayList<WarCard> pile;
    
    //Constructor
    public WarPlayer(String name){
         this.name = name;
         this.hand = new ArrayList<WarCard>();
         this.pile = new ArrayList<WarCard>();
    }
    
    //Accept an incoming WarCard
    public void acceptCard(WarCard incomingCard){
        hand.add(incomingCard);
    }
    
    public void acceptCards(ArrayList<WarCard> incomingPile){
        for (WarCard theCard: incomingPile){
            hand.add(theCard);
        }
    }
    
    public void playCard(){
        pile.add(hand.get(0));
        hand.remove(0);
    }
    
    public void printCards(){
        //Print out the cards in the pile if there are any
        if (pile.size() > 0){
            System.out.print(name + "'s Pile: ");
            if (pile.size() <= 4){
                for (int i = 1; i<=pile.size(); i++){
                    System.out.print(pile.get(pile.size()-i).toString());
                    if (i != pile.size()){
                        System.out.print(", ");
                    }
                }
            }
            else if(pile.size() > 4){
                System.out.print(this.pile.get(this.pile.size()-1).toString() + ", ");
                System.out.print(this.pile.get(this.pile.size()-2).toString() + ", ");
                System.out.print("(" + (this.pile.size()-4) + " more), ");
                System.out.print(this.pile.get(1).toString() + ", ");
                System.out.print(this.pile.get(0).toString());
            }
            
        }
        
        //Only add the separator if both the hand and the pile has cards
        if (hand.size() > 0 && pile.size() >0){
            System.out.print(" | ");
        }
        
        //Print out the cards in the hand
        if (hand.size() > 0){
            System.out.print(name + "'s Hand: ");
            if (this.hand.size() <= 4){
                for (int i = 0; i<this.hand.size(); i++){
                    System.out.print(this.hand.get(i).toString());
                    if (i != this.hand.size()-1){
                        System.out.print(", ");
                    }
                }
            }
            else if (this.hand.size() > 4){
                System.out.print(this.hand.get(0).toString() + ", ");
                System.out.print(this.hand.get(1).toString() + ", ");
                System.out.print("(" + (this.hand.size()-4) + " more), ");
                System.out.print(this.hand.get(this.hand.size()-2).toString() + ", ");
                System.out.print(this.hand.get(this.hand.size()-1).toString());
            }
        }
        System.out.println("");
        
    }
    
    public void clearPile(){
        this.pile.clear();
    }
    
    //Accessor and Mutator methods
    public WarCard getTopPileCard(){
        return this.pile.get(this.pile.size()-1);
    }
    
    public ArrayList<WarCard> getPile(){
        return this.pile;
    }
    
    public ArrayList<WarCard> getHand(){
        return this.hand;
    }
    
    public String getName(){
        return this.name;
    }
}//end of class declaration
