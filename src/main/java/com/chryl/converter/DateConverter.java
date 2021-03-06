package com.chryl.converter;

import org.apache.commons.lang3.StringUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 后台Date接收前端传递的string date类型(直接Date接收String date),
 * 不影响json接收Date类型的数据,但需要在字段上加上两个注解(入参和出参时间注解),或者在.properties文件里配置
 */
@Component
public class DateConverter implements Converter<String, Date> {
//    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//
//    @Override
//    public Date convert(String source) {
//        try {
//            return sdf.parse(source);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }


    private static final String dateFormat = "yyyy-MM-dd HH:mm:ss";
    private static final String shortDateFormat = "yyyy-MM-dd";

    @Override
    public Date convert(String source) {
        if (StringUtils.isBlank(source)) {
            return null;
        }
        source = source.trim();
        try {
            if (source.contains("-")) {
                SimpleDateFormat formatter;
                if (source.contains(":")) {
                    formatter = new SimpleDateFormat(dateFormat);
                } else {
                    formatter = new SimpleDateFormat(shortDateFormat);
                }
                return formatter.parse(source);
            } else if (source.matches("^\\d+$")) {
                Long lDate = new Long(source);
                return new Date(lDate);
            }
        } catch (Exception e) {
            throw new RuntimeException(String.format("parser %s to Date fail", source));
        }
        throw new RuntimeException(String.format("parser %s to Date fail", source));
    }

}
