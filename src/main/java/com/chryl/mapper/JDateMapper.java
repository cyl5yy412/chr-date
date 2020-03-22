package com.chryl.mapper;

import com.chryl.po.JDate;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * Created by Chr.yl on 2020/3/22.
 *
 * @author Chr.yl
 */
public interface JDateMapper {
    Map<String, Object> getAllData();

    void insertData(@Param("jd") JDate jDate);
}
