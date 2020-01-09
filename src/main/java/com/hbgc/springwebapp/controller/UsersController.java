package com.hbgc.springwebapp.controller;

import com.hbgc.springwebapp.domain.Students;
import com.hbgc.springwebapp.json.Json;
import com.hbgc.springwebapp.service.StudentsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("Login")
public class UsersController {
    @Resource
    private StudentsService studentsService;

    @GetMapping("LoginUser")
    public Map<String,Object> queryUser(@RequestParam("username")String username, @RequestParam("password")String password) {
        Students students = null;
        try {
            students=studentsService.login(username,password);
            if (students != null) {
                System.out.println("登录成功");
                return Json.success(students,"登录成功");
            }
            System.out.println("登录失败");
            return Json.fail("登录失败");
        } catch (Exception e) {
            e.printStackTrace();
            return Json.fail("登录失败");
        }

    }
    @PostMapping("RegUser")
    public Map<String,Object> regUser(@RequestBody Students regUser){
        Students students=null;
        try {
            students=studentsService.selectByUsername(regUser.getUsername());
            if (students!=null){
                return Json.fail("此号码已注册");
            }else {
                students=regUser;

                studentsService.save(students);
                System.out.println("注册成功");
                return Json.success(students,"注册成功");
            }
        }catch (Exception e){
            e.printStackTrace();
            return Json.fail("注册失败");
        }
    }
}
