import java.util.ArrayList; 
import java.util.Collections;
import java.util.Scanner; 

public class ShuffleArray13_2 {
    
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
                    Number number = Integer.parseInt(numberString); 
                    list.add(number.doubleValue()); 
                }
            }
            catch (Exception ex) {
                System.out.println("Must enter a number."); 
                System.out.println("Please enter a number, or \"q\" to stop: ");
                in.nextLine(); //clear scanner
            }
        }

        shuffle(list); 

    }

    public static void shuffle(ArrayList<Number> list) {
        if (list == null || list.size() == 0)
            System.out.println("The list is null or empty."); 
        else
            Collections.shuffle(list); 
        System.out.print("The list after shuffling: " + list.toString()); 

    }

}
