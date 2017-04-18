/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author vrsivananda
 */
public class WarDeck {
    
    private ArrayList<WarCard> cardStack;
    
    public WarDeck(){
        for (int i = 2; i<54; i++){
            cardStack.add(new WarCard(i));
        }
    }
        
    public void print(){
        for (WarCard theCard:this.cardStack){
            System.out.println(theCard.toString());
        }
    }
    
    public void shuffle(){
        Collections.shuffle(cardStack);
    }
    
    public void deal(WarPlayer[] players, int numberOfCards){
        
    }
    
    
}
