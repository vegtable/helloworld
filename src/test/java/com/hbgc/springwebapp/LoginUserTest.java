package com.hbgc.springwebapp;

import com.hbgc.springwebapp.domain.Students;
import com.hbgc.springwebapp.domain.TimeTable;
import com.hbgc.springwebapp.service.StudentsService;
import com.hbgc.springwebapp.service.TimeTableService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginUserTest {
    @Resource
    private TimeTableService timeTableService;

    @Test
    public void test(){
       timeTableService.delete("1234",1);
    }


}
