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
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS Z");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String interStandard = "2018-01-22T09:12:43.083Z";
        try {
            Date date = sdf1.parse(interStandard);//拿到Date对象
            String str = sdf2.format(date);
            System.out.println(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Date date = dateParseInterStandard(interStandard);
        String str = sdf2.format(date);
        System.out.println(str);
        System.out.println("---------------");

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

    /**
     * 国际标准时间,转为东八区的时间
     * yyyy-MM-dd'T'HH:mm:ss.SSS Z   这个日期格式为：UTC日期格式。
     * <p>
     * UTC：时间标准时间，世界标准时间 ✅
     * GMT：格林尼治时间
     * CST：北京时间
     * <p>
     * T表示分隔符，Z表示的是UTC。UTC：世界标准时间，在标准时间上加上8小时，即东八区时间，也就是北京时间。
     * UTC日期即世界时，即格林尼治平太阳时，是表示地球自转速率的一种形式。
     * UTC就是世界标准时间，与北京时间相差八个时区。所以只要将UTC时间转化成一定格式的时间，再在此基础上加上8个小时就得到北京时间了。
     *
     * @param sourceDate
     * @return String -> Date
     * @throws ParseException
     */
    public static Date dateParseInterStandard(String sourceDate) throws ParseException {
        sourceDate = sourceDate.replace("Z", " UTC");
        String dateFormatInterStandard = "yyyy-MM-dd'T'HH:mm:ss.SSS Z";
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormatInterStandard);
        Date parse = sdf.parse(sourceDate);
        return parse;
    }

    public static String dateFormatInterStandard(String sourceDate) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf1.parse(sourceDate);//拿到Date对象
        String str = sdf2.format(date);
        return str;
    }


}
