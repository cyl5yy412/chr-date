package com.chryl.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Chr.yl on 2020/4/10.
 *
 * @author Chr.yl
 */
public class Date7Util {

    public static void main(String[] args) throws ParseException {

    }

    /**
     * 获得当前月的最后一天,第一天
     *
     * @param yyyyMM 202001
     * @return 2020-01-31
     * @throws ParseException
     */
    public static String getEndDayofMonth(String yyyyMM, boolean isEnd) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(sdf.parse(yyyyMM));
        if (isEnd) {
            //最后一天
            calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        } else {
            //第一天
            calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.format(calendar.getTime());
    }
//################################ String -> Date

    /**
     * string -> date
     *
     * @param strDate yyyy-MM-dd
     * @return yyyy-MM-dd
     * @throws ParseException
     */
    public static Date parse_yyyyMMdd(String strDate) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(strDate);
        return date;
    }

    /**
     * string -> date
     *
     * @param strDate yyyy-MM
     * @return yyyy-MM
     * @throws ParseException
     */
    public static Date parse_yyyyMm(String strDate) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        Date date = sdf.parse(strDate);
        return date;
    }

    /**
     * @param strDate
     * @param pattern 日期格式 yyyy-MM  yyyy-MM-dd
     * @return
     * @throws ParseException
     */
    public static Date parse(String strDate, String pattern) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Date date = sdf.parse(strDate);
        return date;

    }
//################################ Date -> String

    /**
     * @param date
     * @param pattern yyyyMM,yyyyMM,yyyyMMdd,yyyy-MM-dd
     * @return
     * @throws ParseException
     */
    public static String format(Date date, String pattern) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }

    /**
     * date -> string
     *
     * @param date
     * @return yyyy-MM
     * @throws ParseException
     */
    public static String format_yyyy_Mm(Date date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        return sdf.format(date);
    }

    /**
     * date -> string
     *
     * @param date
     * @return yyyy-MM
     * @throws ParseException
     */
    public static String format_yyyyMM(Date date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
        return sdf.format(date);
    }


    /**
     * date -> string
     *
     * @param date
     * @return yyyy-MM-dd
     * @throws ParseException
     */
    public static String format_yyyy_MM_dd(Date date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }

    /**
     * date -> string
     *
     * @param date
     * @return yyyyMMdd
     * @throws ParseException
     */
    public static String format_yyyyMMdd(Date date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        return sdf.format(date);
    }


}
