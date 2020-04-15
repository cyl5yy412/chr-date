package com.chryl.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

    //测试 接收date string日期
    @PostMapping("/customDate")
    public String CustomDate(Date date) {
        System.out.println("date=" + date);
        return "success";
    }
}
