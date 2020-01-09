package com.hbgc.springwebapp.service;

import com.hbgc.springwebapp.domain.TimeTable;

import java.util.List;

public interface TimeTableService {
    List<TimeTable> findAllByUsername(String username);
    void save(TimeTable timeTable);
    void delete(String username,Integer courseId);
    TimeTable selectByUsernameAndCourseId(String username,Integer courseId);
}
