package com.hbgc.springwebapp.controller;

import com.hbgc.springwebapp.domain.TimeTable;
import com.hbgc.springwebapp.json.Json;
import com.hbgc.springwebapp.service.TimeTableService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.sql.Time;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("TimeTable")
public class TimeTableController {
    @Resource
    private TimeTableService timeTableService;

    @GetMapping("FindTimeTable")
    public Map<String,Object> findTimeTable(@RequestParam("username")String username){
        List<TimeTable> timeTableList=null;
        try {
            timeTableList=timeTableService.findAllByUsername(username);
            if (timeTableList!=null){
                return Json.success(timeTableList,"查询成功");
            }
            return Json.fail("未选中课程");
        }catch (Exception e){
            e.printStackTrace();
            return Json.fail("查询失败");
        }
    }

    @PostMapping("InsertTimeTable")
    public Map<String,Object> insertTimeTable(@RequestBody TimeTable timeTable){
        TimeTable tempTable=null;
        try {
            tempTable=timeTableService.selectByUsernameAndCourseId(timeTable.getUsername(),timeTable.getCourseId());
            if (tempTable==null){
                timeTableService.save(timeTable);
                return Json.success(null,"选课成功");
            }
            return Json.fail("无法重复选课");

        }catch (Exception e){
            e.printStackTrace();
            return Json.fail("选课失败");
        }
    }

    @GetMapping("DeleteTimeTable")
    public Map<String,Object> deleteTimeTable(@RequestParam("username")String username,@RequestParam("courseId")Integer courseId){
        try{
            timeTableService.delete(username,courseId);
            return Json.success(null,"退课成功");
        }catch (Exception e){
            e.printStackTrace();
            return Json.fail("退课失败");
        }
    }
}
