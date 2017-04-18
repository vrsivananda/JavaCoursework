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
public class WarCard {
    private int value;
    private String suit;
    private String rank;
    
    public WarCard(int value){
        
        this.value = value;
        this.setRank(value/4 + 2);
        this.setSuit(value%4);
        
    }
    
    public String toString(){
        String name = rank + " of " + suit;
        return name;
    }
    
    public int compareTo(WarCard otherCard){
        int thisValue = this.value/4;
        int otherValue = otherCard.value/4;
        
        if (thisValue > otherValue){
            return 1;
        }
        else if (thisValue == otherValue){
            return 0;
        }
        else if (thisValue < otherValue){
            return -1;
        }
        else{
            System.out.println("Error in comparing cards. Returning 0.");
            return 0;
        }
    }
    
    private void setRank(int num){
        if (num >= 2 && num <= 14){
            
            if(num == 2){
                this.rank = "Two";
            }
            else if (num == 3){
                this.rank = "Three";
            }
            else if (num == 4){
                this.rank = "Four";
            }
            else if (num == 5){
                this.rank = "Five";
            }
            else if (num == 6){
                this.rank = "Six";
            }
            else if (num == 7){
                this.rank = "Seven";
            }
            else if (num == 8){
                this.rank = "Eight";
            }
            else if (num == 9){
                this.rank = "Nine";
            }
            else if (num == 10){
                this.rank = "Ten";
            }
            else if (num == 11){
                this.rank = "Jack";
            }
            else if (num == 12){
                this.rank = "Queen";
            }
            else if (num == 13){
                this.rank = "King";
            }
            else if (num == 14){
                this.rank = "Ace";
            }
            else{
                System.out.println("Error: This should never print in setRank.");
            }
        }
        else{
            System.out.println("Error: number is outside legal values. No Change in rank.");
        }
    }
    
    private void setSuit(int num){
        if(num>=0 && num<=3){
            if(num == 0){
                this.suit = "Diamonds";
            }
            else if (num == 1){
                this.suit = "Clubs";
            }
            else if (num == 2){
                this.suit = "Hearts";
            }
            else if (num == 3){
                this.suit = "Spades";
            }
            else{
                System.out.println("Error: This should never print in setSuit.");
            }
        }else{
            System.out.println("Error: number is outside legal values. No Change in suit.");
        }
    }
}
