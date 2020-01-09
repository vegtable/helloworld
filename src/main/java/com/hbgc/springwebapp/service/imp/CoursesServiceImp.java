package com.hbgc.springwebapp.service.imp;

import com.hbgc.springwebapp.domain.Courses;
import com.hbgc.springwebapp.repository.CoursesRepository;
import com.hbgc.springwebapp.service.CoursesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CoursesServiceImp implements CoursesService {
    @Resource
    private CoursesRepository coursesRepository;
    @Override
    public List<Courses> findAll() {
        return coursesRepository.findAll();
    }
}
