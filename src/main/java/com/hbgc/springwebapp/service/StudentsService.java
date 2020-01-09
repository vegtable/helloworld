package com.hbgc.springwebapp.service;

import com.hbgc.springwebapp.domain.Students;


public interface StudentsService {
    void save(Students student);
    void update(Students student);
    Students queryBySid(int sid);
    void delete(int sid);
    Students login(String username,String password);
    Students selectByUsername(String username);
}
