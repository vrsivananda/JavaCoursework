/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1;

/**
 *
 * @author vrsiv
 */
public class HW1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Quadratic Equation to solve is (x+3)(x-4)
        // which can also be expressed as y = (x^2)-x-12
        // Derivative of the Quadratic Equation is y' = 2x-1
        
        double epsilon = 0.001;
        double guess = 5;
        double yPrime = 0;
        double change = 0;
        double error = (guess+3)*(guess-4);
        
        while (error > epsilon || error < -epsilon){
            
            //Calculate yPrime
            yPrime = (2*guess)-1;

            //Calculate the change
            change = -((guess+3)*(guess-4))/yPrime;
            
            //Print out the statements
            System.out.println("x = " + guess + ", f = " + error + ", dfdx = " + yPrime + ", dx = " + change);
            
            //Update the guess
            guess = guess + change;
                    
            //Calcualte the error again
            error = (guess+3)*(guess-4);
        }
        
        //Print out the statements if converged
        System.out.println("x = " + guess + ", f = " + error);
    
    }
    
}
