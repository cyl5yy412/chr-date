package com.chryl;

import com.chryl.mapper.JDateMapper;
import com.chryl.po.JDate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChrDateApplicationTests {
    @Autowired
    private JDateMapper jDateMapper;

    @Test
    public void contextLoads() {
        JDate jDate = new JDate();
        jDate.setJDate(LocalDate.now());
        jDate.setJDatetime(LocalDateTime.now());
        jDateMapper.insertData(jDate);

        Map<String, Object> allData = jDateMapper.getAllData();
        System.out.println(allData);
    }

}
