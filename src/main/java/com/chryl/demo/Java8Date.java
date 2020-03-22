package com.chryl.demo;

import com.chryl.util.Date8Util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by Chr.yl on 2020/3/22.
 *
 * @author Chr.yl
 */
public class Java8Date {

    public static void main(String[] args) {
        java8DateTest();
    }

    /**
     * java8时间处理测试
     * LocalDate、LocalTime、LocalDateTime
     */
    public static void java8DateTest() {
        /**
         * LocalDate
         */
        System.out.println(">>>>>>>>>LocalDate<<<<<<<<");

        //获取当前日期,2018-08-21
        LocalDate localDate = LocalDate.now();
        System.out.println("当前日期>" + localDate);

        //获取当前年 2018
        System.out.println(localDate + "当前年>" + localDate.getYear());

        //获取当前月 8
        System.out.println(localDate + "当前月>" + localDate.getMonthValue());

        //获取当前年中的日 233
        System.out.println(localDate + "当前年中的日>" + localDate.getDayOfYear());

        //获取当前月中的日 21
        System.out.println(localDate + "当前月中的日>" + localDate.getDayOfMonth());

        //获取当前星期中的日 2
        System.out.println(localDate + "当前星期中的日>" + localDate.getDayOfWeek().getValue());

        //当前日期前一天,2018-08-20 minus:（表示运算）减去
        System.out.println(localDate + "前一天>" + localDate.minusDays(1));

        //当前日期后一天,2018-08-20 plus:（表示运算）加
        System.out.println(localDate + "后一天>" + localDate.plusDays(1));

        //当前日期前一月,2018-07-21 minus:（表示运算）减去
        System.out.println(localDate + "前一月>" + localDate.minusMonths(1));

        //当前日期后一月,2018-09-21 plus:（表示运算）加
        System.out.println(localDate + "后一月>" + localDate.plusMonths(1));

        //当前日期前一年,2017-08-21 minus:（表示运算）减去
        System.out.println(localDate + "前一年>" + localDate.minusYears(1));

        //当前日期后一年,2019-08-21 plus:（表示运算）加
        System.out.println(localDate + "后一年>" + localDate.plusYears(1));

        //当前日期前一周,2018-08-14 minus:（表示运算）减去
        System.out.println(localDate + "前一周>" + localDate.minusWeeks(1));

        //当前日期后一周,2018-08-28 plus:（表示运算）加
        System.out.println(localDate + "后一周>" + localDate.plusWeeks(1));


        /**
         * LocalTime
         */
        System.out.println(">>>>>>>>>LocalTime<<<<<<<<");
        //获取当前时间 11:36:13.693
        LocalTime localTime = LocalTime.now();
        System.out.println("当前时间>" + localTime);

        //获取当前时 11
        System.out.println(localTime + "当前时>" + localTime.getHour());

        //获取当前分 38
        System.out.println(localTime + "当前分>" + localTime.getMinute());

        //获取当前秒 26
        System.out.println(localTime + "当前秒>" + localTime.getSecond());

        //当前时间前一时,11:36:12.693 minus:（表示运算）减去
        System.out.println(localTime + "前一时>" + localTime.minusHours(1));

        //当前时间后一时,11:36:12.693 minus:（表示运算）减去
        System.out.println(localTime + "后一时>" + localTime.plusHours(1));

        //当前时间前一分,11:39:05.970 minus:（表示运算）减去
        System.out.println(localTime + "前一分>" + localTime.minusMinutes(1));

        //当前时间后一分,11:36:12.693 minus:（表示运算）减去
        System.out.println(localTime + "后一分>" + localTime.plusMinutes(1));

        //当前时间前一秒,11:36:12.693 minus:（表示运算）减去
        System.out.println(localTime + "前一秒>" + localTime.minusSeconds(1));

        //当前时间后一秒,11:36:12.693 minus:（表示运算）减去
        System.out.println(localTime + "后一秒>" + localTime.plusSeconds(1));

        /**
         * localDateTime
         * LocalDateTime类是Java 8中日期时间功能里，用于表示当地的日期与时间的类，它的值是无时区属性的。
         * 你可以将其视为Java 8中LocalDate与LocalTime两个类的结合。
         * 你可以通过这些方法访问其日期时间
         * 	getYear()
         getMonth()
         getDayOfMonth()
         getDayOfWeek()
         getDayOfYear()
         getHour()
         getMinute()
         getSecond()
         getNano()
         */
        System.out.println(">>>>>>>>>localDateTime<<<<<<<<");

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("当前完整日期>" + localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));


        /**
         * 时间格式化
         */
        System.out.println(">>>>>>>>>时间格式化<<<<<<<<");

        DateTimeFormatter formatDataTime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm:ss");

        String formatDataTimeStr = localDateTime.format(formatDataTime);
        String formatDateStr = localDateTime.format(formatDate);
        String formatTimeStr = localDateTime.format(formatTime);

        System.out.println("完整日期格式化之后" + formatDataTimeStr);
        System.out.println("日期格式化之后" + formatDateStr);
        System.out.println("时间格式化之后" + formatTimeStr);

        /**
         * 时间比较大小
         */
        System.out.println(">>>>>时间比较大小<<<<<");

        LocalDateTime time1 = LocalDateTime.parse("2018-05-12 08:30:30", formatDataTime);
        LocalDateTime time2 = LocalDateTime.parse("2018-04-20 16:30:30", formatDataTime);

        System.out.println("time1=" + time1);
        System.out.println("time2=" + time2);

        System.out.println("time1==time2:" + time1.isEqual(time2));
        System.out.println("time1>time2:" + time1.isAfter(time2));
        System.out.println("time1<time2:" + time1.isBefore(time2));
        System.out.println("-------------------------------------");
        System.out.println(Date8Util.DATE_FORMAT);
    }

}
