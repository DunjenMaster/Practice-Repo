package DateTimeAPI;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class CalendarTimeZone {
    public static void main(String[] args){
        // Calendar class

        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(2028));
        System.out.println("Today's date is: " + gc.get(Calendar.DATE));
        System.out.println("Which Month is this? " + gc.get(Calendar.MONTH));
        System.out.println("Which Year is this? " + gc.get(Calendar.YEAR));
        System.out.println("Which Day is this? " + gc.get(Calendar.DAY_OF_WEEK));
        System.out.println("How many days are over in 2025? " + gc.get(Calendar.DAY_OF_YEAR));
        System.out.println(gc.getTime());

        System.out.println();

        // TimeZone class
        TimeZone tz = TimeZone.getTimeZone("Asia/Kolkata");
        System.out.println(tz.getID());
        System.out.println(tz.getDisplayName());
    }
}
