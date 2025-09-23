package DateTimeAPI;

import java.util.Date;

public class DeprecatedDateClass {
    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis()/1000/60/60/24/365);

        Date date = new Date();
        System.out.println(date); // Current date and time

        Date d = new Date("1/1/2020"); // Deprecated way to create a date
        System.out.println(d);

        // Deprecated methods in Date class
        System.out.println(date.getDate()); // which day of the month is today?
        System.out.println(date.getTime()); // Time in milliseconds since 1970
        System.out.println(date.getDay()); // which day of the week is today?
        System.out.println(date.getMonth()); // Months start from 0 (0 - January, 1 - February, ...)
        System.out.println(date.getYear()); // Years since 1900
    }
}
