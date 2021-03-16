package com.chryl.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Chr.yl on 2021/3/16.
 *
 * @author Chr.yl
 */
public class CalenderUtil {

    /**
     * 昨天
     *
     * @return
     */
    public static String getYesterDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -1);

        Date date = calendar.getTime();

        SimpleDateFormat simpleFormatter = new SimpleDateFormat("yyyyMMdd");
        String yesterday = simpleFormatter.format(date);
        return yesterday;

    }
}
