/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floydstriangle;

/**
 *
 * @author vrsiv
 */
public class FloydsTriangle {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int k = 1;
        for (int i = 0; i<5; i++){
            System.out.println("");
            for (int j = 0; j< i ; j++){
                System.out.print(k + " ");
                k++;
                        
            }
            
        }
        
    }
    
}
