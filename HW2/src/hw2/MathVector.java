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
public class MathVector {
    //Instance variables
    //dimensions keep track of the number of dimensions
    private int dimensions;
    //the numbers in the array represents the values in the vector
    private double[] theVector;
    
    //Constructor that takes the dimension as input
    public MathVector(int dimensions){
        this.dimensions = dimensions;
        this.theVector = new double[dimensions];
        //^ array initialized to zero
    }
    
    //Contructor that takes all the values as input
    public MathVector(double[] theInputs){
        this.dimensions = theInputs.length;
        this.theVector = theInputs;
    }
    
    public double getEl(int theIndex){
        if (theIndex <= this.getDimensions() & theIndex > 0){
            return (theVector[theIndex-1]);
        }
        else{
            System.out.println("The index is out of range.");
            System.out.println("0 is returned.");
            return 0;
        }
    }
    
    //neg returns a new MathVector object with all the values reversed
    public MathVector neg(){
        return this.sp(-1);
    }
    
    //mag returns the magnitude of a MathVector
    public double mag(){
        double squareSums = 0;
        for (int i = 1; i<=this.getDimensions(); i++){
            squareSums += this.getEl(i)*this.getEl(i);
        }
        return Math.sqrt(squareSums);
    }
    
    //dot returns the dot product of the vector
    public double dot(MathVector a){
        if (a.getDimensions() == this.getDimensions()){
            double theSum = 0;
            for (int i = 1; i<=a.getDimensions(); i++){
                theSum += a.getEl(i)*this.getEl(i);
            } 
            return theSum;
        }
        else{
            System.out.println("The dimensions of the two MathVectors do not match.");
            System.out.println("0 is returned.");
            return 0;
        }                   
    }
    
    //plus returns the addition of two vectors
    public MathVector plus(MathVector a){
        MathVector newVector = new MathVector(a.getDimensions());
        
        if (a.getDimensions() == this.getDimensions()){    
            for( int i = 1; i <= a.getDimensions(); i++){
                newVector.setElement(i, a.getEl(i)+this.getEl(i));                
            }
            return newVector;
        }
        else{
            System.out.println("The dimensions of the two MathVectors do not match.");
            System.out.println("Empty MathVector is returned.");
            return new MathVector(0);
        }
    }
    
    //Returns a scalar product
    public MathVector sp(double num){
        MathVector newVector = new MathVector(this.getDimensions());
        for (int i = 1; i <= this.getDimensions(); i++){
            newVector.setElement(i,this.getEl(i)*num);
        }
        return newVector;
    }
    
    //printMe prints out the values of the vector
    public void printMe(){
        System.out.print("[");
        for(int i = 1; i<=this.getDimensions(); i++){
            System.out.print(this.getEl(i));
            if (i<this.getDimensions()){
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println("");
    }
    
    
    //accessor and mutator methods
    
    public int getDimensions(){
        return this.dimensions;
    }
    
    public double[] getTheVector(){
        return this.theVector;
    }
    
//    public void setDimensions(int newDimensions){
//        this.dimensions = newDimensions;
//    }
    
    public void setElement(int index, double newElement){
        if (index <= this.dimensions & index > 0){
            this.theVector[index-1] = newElement;
        }
        else{
            System.out.println("Index out of range. Please enter an appropriate index.");
        }
    }
    
  
}
    
    

