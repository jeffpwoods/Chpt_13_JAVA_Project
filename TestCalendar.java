import java.util.Calendar;
import java.util.GregorianCalendar; 
import java.util.Date; 

public class TestCalendar {

    public static void main(String[] args) {
        Calendar cal = new GregorianCalendar(); 
        System.out.println("The current time is: " + new Date());
        System.out.println("YEAR: " + cal.get(Calendar.YEAR)); 
        System.out.println("MONTH: " + (cal.get(Calendar.MONTH) + 1)); 
        System.out.println("DATE: " + cal.get(Calendar.DATE)); 
        System.out.println("HOUR: " + cal.get(Calendar.HOUR)); 
        System.out.println("HOUR_OF_DAY: " + cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("MINUTE: " + cal.get(Calendar.MINUTE)); 
        System.out.println("SECOND: " + cal.get(Calendar.SECOND)); 
        System.out.println("DAY_OF_WEEK: " + (cal.get(Calendar.DAY_OF_WEEK) - 1)); 
        System.out.println("DAY_OF_MONTH: " + cal.get(Calendar.DAY_OF_MONTH)); 
        System.out.println("DAY_OF_YEAR: " + cal.get(Calendar.DAY_OF_YEAR)); 
        System.out.println("WEEK_OF_MONTH: " + cal.get(Calendar.WEEK_OF_MONTH)); 
        System.out.println("WEEK_OF_YEAR: " + cal.get(Calendar.WEEK_OF_YEAR)); 
        switch (cal.get(Calendar.AM_PM)) {
            case 0: System.out.println("AM_PM: AM"); 
            case 1: System.out.println("AM_PM: PM");   
        }

        Calendar calendar = new GregorianCalendar(2022, 2, 9); 
        String[] dayNameOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", 
                    "Thursday", "Friday", "Saturday", "Sunday"}; 
        System.out.println("Wednesday, February 09, 2022 is a " + 
                    dayNameOfWeek[calendar.get(Calendar.DAY_OF_WEEK) - 1]); 
    }
    
}
