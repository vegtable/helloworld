package com.hbgc.springwebapp.service.imp;

import com.hbgc.springwebapp.domain.Students;
import com.hbgc.springwebapp.repository.StudentsRepository;
import com.hbgc.springwebapp.service.StudentsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service

public class StudentsServiceImp implements StudentsService {
    @Resource
    StudentsRepository studentsRepository;

    @Override
    public void save(Students student) {
        studentsRepository.save(student);
    }

    @Override
    public void update(Students student) {
        studentsRepository.save(student);
    }

    @Override
    public Students queryBySid(int sid) {
        return studentsRepository.getOne(sid);
    }

    @Override
    public void delete(int sid) {
        studentsRepository.deleteById(sid);
    }

    @Override
    public Students login(String username, String password) {
        return studentsRepository.queryByUsernameAndPassword(username,password);
    }

    @Override
    public Students selectByUsername(String username) {
        return studentsRepository.queryByUsername(username);
    }


}
