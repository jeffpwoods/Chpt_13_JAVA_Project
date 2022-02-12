import java.util.Scanner; 
import java.util.Collections;
import java.math.BigDecimal;
import java.util.ArrayList;

public class SortArray13_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  
        ArrayList<Number> list = new ArrayList<>(); 
        System.out.println("Enter numbers to add to the list " +
                ", enter \"q\" to stop"); 
        String numberString = "";  

        while (!numberString.contains("q")) {
            try {
                numberString = in.next();
                if (!numberString.contains("q")) {
                    list.add(new BigDecimal(numberString)); 
                }
            }
            catch (Exception ex) {
                System.out.println("Must enter a number."); 
                System.out.println("Please enter a number, or \"q\" to stop: ");
                in.nextLine(); //clear scanner
            }
        }
        sort(list); 

    }

    public static void sort(ArrayList<Number> list) {
        if (list == null || list.size() == 0)
            System.out.println("The list is null or empty."); 
        ArrayList<BigDecimal> newList = new ArrayList<>();
        //Move to new BigDecimal array bc <Number> does not contain <comparable> 
        for (int i = 0; i < list.size(); i++) { 
            newList.add(new BigDecimal(list.get(i).toString())); 
        }
        Collections.sort(newList); 
        System.out.print("The list after sorting: " + newList.toString()); 

    }
    
}
