// Simple program using the idea of abstract
// classes (such as the Number class)

import java.math.BigInteger;
import java.util.ArrayList;
import java.math.*; 

public class LargestNumber {

    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>(); 
        list.add(45); 
        list.add(3445.53); 
        list.add(new BigInteger("3432323234344343101")); 
        list.add(new BigDecimal("2.0909090989091343433344343"));
        
        System.out.println("The largest number in the list is: " +
                    getLargestNumber(list)); 

    }

    public static Number getLargestNumber(ArrayList<Number> list) {
        if (list == null || list.size() == 0) {
            return null; 
        }

        Number number = list.get(0); 
        for (int i = 0; i < list.size(); i++) {
            if (number.doubleValue() < list.get(i).doubleValue())
                number = list.get(i); 
        }
        return number; 
    }
    
}
