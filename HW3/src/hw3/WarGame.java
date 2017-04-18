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
        System.out.println("Testing the WarCard Class");
        
        System.out.println("Success if prints out WarCards ranks from 2 to Ace,");
        System.out.println("and within each rank in the order of Diamond, Club, Heart, Spade");
        for (int i = 0; i<52; i++){
            WarCard a = new WarCard(i);
            System.out.println(a.toString());
        }
        
        WarDeck d = new WarDeck();
        System.out.println("Before Shuffling:::::::::::");
        d.print();
        d.shuffle();
        System.out.println("After Shuffling:::::::::::");
        d.print();
        
    }
    
}
