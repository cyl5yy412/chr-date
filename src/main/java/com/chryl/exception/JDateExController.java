package com.chryl.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Chr.yl on 2020/3/23.
 *
 * @author Chr.yl
 */
@ControllerAdvice//自定义异常处理
public class JDateExController {


    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    @ResponseStatus(code = HttpStatus.INSUFFICIENT_STORAGE)
    public Object show() {

        System.out.println("advice");
        return "advice";
    }
}
