package com.chryl.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Chr.yl on 2020/5/30.
 *
 * @author Chr.yl
 */
public class MyData {
    private String date;

    //    DateTimeFormate ：入参
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    //    JsonFormat ：出参 , 如果在JavaBean处设置了该注解,则会覆盖.properties配置文件的配置
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date myDate;
    private String cmcc;
    private Double aDouble;
    private Integer aInteger;
    private Boolean aBoolean;
    private BigDecimal aBigDecimal;

    public MyData() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCmcc() {
        return cmcc;
    }

    public void setCmcc(String cmcc) {
        this.cmcc = cmcc;
    }

    public Double getaDouble() {
        return aDouble;
    }

    public void setaDouble(Double aDouble) {
        this.aDouble = aDouble;
    }

    public Integer getaInteger() {
        return aInteger;
    }

    public void setaInteger(Integer aInteger) {
        this.aInteger = aInteger;
    }

    public Boolean getaBoolean() {
        return aBoolean;
    }

    public void setaBoolean(Boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

    public BigDecimal getaBigDecimal() {
        return aBigDecimal;
    }

    public void setaBigDecimal(BigDecimal aBigDecimal) {
        this.aBigDecimal = aBigDecimal;
    }

    public Date getMyDate() {
        return myDate;
    }

    public void setMyDate(Date myDate) {
        this.myDate = myDate;
    }
}
