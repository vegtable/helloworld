package com.hbgc.springwebapp.controller;

import com.hbgc.springwebapp.domain.Courses;
import com.hbgc.springwebapp.json.Json;
import com.hbgc.springwebapp.service.CoursesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("Courses")
public class CoursesController {
    @Resource
    private CoursesService coursesService;

    @GetMapping("AllCourses")
    public Map<String,Object> findAllCourse(){
        List<Courses> coursesList=null;
        try {
            coursesList=coursesService.findAll();
            return Json.success(coursesList,"查询成功");
        }catch (Exception e){

            return Json.fail("查询出错");
        }

    }
}
