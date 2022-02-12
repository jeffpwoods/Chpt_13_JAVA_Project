import edu.iue.woods.*; 
import java.util.Scanner; 

public class TestComplexNumbers {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        //Create first complex number
        System.out.print("Enter the elements of the first complex number: "); 
        double a = in.nextDouble(); 
        double b = in.nextDouble(); 
        Complex firstComplex = new Complex(a, b); 
        //Create second complex number
        System.out.print("Enter the elements of the second complex number: "); 
        double c = in.nextDouble(); 
        double d = in.nextDouble();  
        Complex secondComplex = new Complex(c, d); 
        //Add complex numbers
        System.out.printf("(%s) + (%s) = %s", firstComplex.toString(), 
                secondComplex.toString(), firstComplex.add(secondComplex)); 
        //Subtract complex numbers
        System.out.printf("\n\n(%s) - (%s) = %s", firstComplex.toString(), 
                secondComplex.toString(), firstComplex.subtract(secondComplex)); 
        //Multiply complex numbers
        System.out.printf("\n\n(%s) * (%s) = %s", firstComplex.toString(), 
                secondComplex.toString(), firstComplex.multiply(secondComplex)); 
        //Divide complex numbers
        System.out.printf("\n\n(%s) / (%s) = (%s)", firstComplex.toString(), 
                secondComplex.toString(), firstComplex.divide(secondComplex)); 
        //Absolute value of complex numbers
        System.out.printf("\n\n|%s| = %.4f", firstComplex.toString(), 
                firstComplex.abs()); 
        System.out.printf("\n\n|%s| = %.4f", secondComplex.toString(), 
                secondComplex.abs());
        //Compare complex numbers
        if (firstComplex.compareTo(secondComplex) == 0)
            System.out.printf("\n\n%s = %s : true", firstComplex.toString(), 
                    secondComplex.toString()); 
        else if (firstComplex.compareTo(secondComplex) == 1 ||
            firstComplex.compareTo(secondComplex) == -1)
            System.out.printf("\n\n%s = %s : false", firstComplex.toString(), 
                    secondComplex.toString());  
        //Clone and compare complex number one
        Complex thirdComplex = (Complex)firstComplex.clone(); 
        System.out.printf("\n\nThe clone of the first complex number is %s", 
                thirdComplex.toString()); 
        if (firstComplex.compareTo(thirdComplex) == 0)
            System.out.printf("\n\nIs the first complex number equal to the clone? :true"); 
        else 
            System.out.printf("\n\nIs the first complex number equal to the clone? :false"); 
        //Get real and imaginary parts of complex numbers
        System.out.printf("\n\nThe real part of complex number one: %.2f", 
                firstComplex.getRealPart()); 
        System.out.printf("\n\nThe imaginary part of complex number one: %s", 
                firstComplex.getImaginaryPart());  
        //Sorting an array of complex numbers
        Complex fourthComplex = new Complex(4, -0.5); 
        System.out.println("\nBefore sorting the array, the order is: "); 
        Complex[] complexArray = {firstComplex, secondComplex, thirdComplex, fourthComplex}; 
        System.out.println(java.util.Arrays.toString(complexArray)); 
        java.util.Arrays.sort(complexArray); 
        System.out.println("After sorting the array of complex numbers: " + 
                java.util.Arrays.toString(complexArray)); 


    }

}
