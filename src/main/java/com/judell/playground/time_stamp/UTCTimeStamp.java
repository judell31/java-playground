package com.judell.playground.time_stamp;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
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

        /*
        This may be wrong
         */
        ZoneId fromTimeZone = ZoneId.of("Etc/UTC");    //Source timezone
        ZoneId toTimeZone = ZoneId.of(timeZone.getID());  //Target timezone

        LocalDateTime today = LocalDateTime.now();          //Current time
        ZonedDateTime currentUtcTime = today.atZone(fromTimeZone);
        ZonedDateTime currentUsTime = currentUtcTime.withZoneSameInstant(toTimeZone);

        //Zoned date time at source timezone
        ZonedDateTime currentISTime = today.atZone(fromTimeZone);

        //Zoned date time at target timezone
        ZonedDateTime currentETime = currentISTime.withZoneSameInstant(toTimeZone);

        //Format date time - optional
        System.out.println(currentUtcTime);
        System.out.println(currentUsTime);
    }
}
