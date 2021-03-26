package com.judell.playground.time_stamp;

import java.time.Instant;
import java.util.Calendar;
import java.util.TimeZone;

public class UTCTimeStamp {

    public static void main(String[] args) {
        /*
        Gets Time in utc
         */
        System.out.println("UTC: " + Instant.now());


        /*
        Gets time zone info
         */
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        System.out.println("TimeZone: " + timeZone);
    }
}
