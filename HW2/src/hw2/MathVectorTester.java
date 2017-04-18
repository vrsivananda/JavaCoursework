/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;

/**
 *
 * @author vrsiv
 */
public class MathVectorTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double aArray[] = {7,1,8};
        double bArray[] = {2,10,3};
        double cArray[] = {23,12,31,99};
        
        MathVector a = new MathVector(aArray);
        MathVector b = new MathVector(bArray);
        MathVector c = new MathVector(cArray);
        MathVector d = new MathVector(0);
        
        c.setElement(2,1984);
        
        a.printMe();
        b.printMe();
        c.printMe();
        d.printMe();
        
        
        System.out.println("a.getEl(3): " + a.getEl(3));
        System.out.println("b.getEl(-1): " + b.getEl(-1));
        
        System.out.println("a.neg(): ");
        a.neg().printMe();
        System.out.println("b.neg(): ");
        b.neg().printMe();
        
        System.out.println("a.mag(): " + a.mag());
        System.out.println("b.mag(): " + b.mag());
        System.out.println("c.mag(): " + c.mag());
        
        System.out.println("a.dot(b): " + a.dot(b));
        System.out.println("b.dot(a): " + b.dot(a));
        System.out.println("c.dot(a): " + c.dot(a));
        
        System.out.println("a.plus(b): "); 
        a.plus(b).printMe();
        System.out.println("b.plus(a): ");
        b.plus(a).printMe();
        System.out.println("b.plus(c): ");
        b.plus(c).printMe();
        
        System.out.println("a.sp(5): "); 
        a.sp(5).printMe();
        System.out.println("b.sp(5): ");
        b.sp(5).printMe();
       
        
        

    }
    
}
