package com.chryl.controller;

import com.chryl.po.MyData;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * Created by Chr.yl on 2020/3/23.
 *
 * @author Chr.yl
 */
@RestController
@RequestMapping("/j")
public class JDateController {

    @ResponseStatus(HttpStatus.BAD_GATEWAY)
    @GetMapping("/jd2")
    public String show2() {
        return "zzz";
    }

    @GetMapping("/jd")
    public void show() {

        throw new RuntimeException("aaaaaa");
    }

    /**
     * 测试@RequestBody 接收date,需要加上Json注解
     * {
     * "date": "2020-05-31 12:34:56",
     * "myDate":"2020-05-31 12:34:56",
     * "aDouble":"3.333",
     * "aInteger":"20",
     * "aBoolean":"true",
     * "aBigDecimal":"22.001"
     * <p>
     * }
     */
    //测试 接收date string日期
    @PostMapping("/customDate")
//    public String CustomDate(Date date) {
    public Object CustomDate(@RequestBody MyData date) {
        System.out.println("date=" + date);
//        return "success";
        return date;
    }

}
