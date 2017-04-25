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
        cardStack = new ArrayList<>();
        for (int i = 0; i<=51; i++){
            WarCard temp = new WarCard(i);
            cardStack.add(temp);
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
    
    public void deal(WarPlayer p1, WarPlayer p2){
        while (this.cardStack.size() > 0){
            p1.acceptCard(this.cardStack.get(0));
            this.cardStack.remove(0);
            p2.acceptCard(this.cardStack.get(0));
            this.cardStack.remove(0);
        }
    }
    
    
}
