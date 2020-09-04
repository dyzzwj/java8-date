package com.dyzwj.java8date.date;

import java.time.*;

public class TestLocalTime {

    public static void main(String[] args) {
//        testLocalTime();
        test();
    }


    public static void testLocalTime(){
        LocalTime localTime = LocalTime.now();

        System.out.println(localTime);
    }



    public static void test(){
        long start = 1570688451898L;
        long end = 1570688871900L;

        Instant startInstant = Instant.ofEpochMilli(start);

        Instant endInstant = Instant.ofEpochMilli(end);

        System.out.println(startInstant);
        System.out.println(endInstant);

//        int i = startInstant.compareTo(endInstant);
//        System.out.println(i);

//        LocalDateTime localDateTime = LocalDateTime.now();
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(startInstant, zoneId);
        LocalDateTime localDateTime1 = LocalDateTime.ofInstant(endInstant, zoneId);
        Duration between = Duration.between(localDateTime, localDateTime1);

    }


}
