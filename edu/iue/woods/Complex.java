/*
* Design a class named Complex for representing complex numbers
* and the methods add, subtract, multiply, and divide and abs
* for performing complex number operations 
*/

package edu.iue.woods;

public class Complex implements Cloneable, Comparable<Complex> {
    private double a; 
    private double b;  
    
    public Complex() {}; 

    public Complex(double a) {
        this.a = a; 
        this.b = 0; 
    }

    public Complex(double a, double b) {
        this.a = a; 
        this.b = b; 
    }

    public double getRealPart() {
        return this.a; 
    }

    public String getImaginaryPart() {
        return this.b + "" + 'i'; 
    }

    public String add(Complex c) {
        double addRealParts = this.a + c.a; 
        double addImaginaryParts = this.b + c.b;
        return 
            addRealParts + " + " + addImaginaryParts + 'i';  
    }

    public String subtract(Complex c) {
        double subtractReal = this.a - c.a; 
        double subtractImaginary = this.b - c.b; 
        return
            subtractReal + " + " + subtractImaginary + 'i'; 
    }

    public String multiply(Complex c) {
        double multiReal = (this.a * c.a) - (this.b * c.b); 
        double multiImaginary = (this.b * c.a) + (this.a * c.b); 
        return String.format("%.4f", multiReal) + " + " + 
                String.format("%.4f", multiImaginary) + 'i'; 
    }

    public String divide(Complex c) {
        double divideReal = (this.a * c.a + this.b * c.b) /
                (Math.pow(c.a, 2) + Math.pow(c.b, 2)); 
        double divideImaginary = (this.b * c.a - this.a * c.b) /
                (Math.pow(c.a, 2) + Math.pow(c.b, 2));
        return String.format("%.4f", divideReal) + " + " + 
                String.format("%.4f", divideImaginary) + 'i';  
    }

    public double abs() {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)); 
    }

    @Override
    public String toString() {
        return this.a + " + " + this.b + 'i'; 
    }

    @Override
    public int compareTo(Complex c) {
        if (this.abs() > c.abs())
            return 1; 
        else if (this.abs() < c.abs())
            return -1; 
        else 
            return 0; 
    }

    @Override
    public Object clone() {
        try {
            return super.clone(); 
        }
        catch (CloneNotSupportedException ex) {
            return null; 
        }
    }

}
