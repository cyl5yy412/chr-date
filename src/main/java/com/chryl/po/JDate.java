package com.chryl.po;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 使用java8Date操作数据库
 * Created by Chr.yl on 2020/3/22.
 *
 * @author Chr.yl
 */
@Data
public class JDate implements Serializable {
    private static final long serialVersionUID = 6921109039781798937L;

    private String jId;

    private LocalDate jDate;

    private LocalDateTime jDatetime;

}
