package com.chryl.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

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
}
