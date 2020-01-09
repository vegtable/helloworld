package com.hbgc.springwebapp.service.imp;

import com.hbgc.springwebapp.domain.TimeTable;
import com.hbgc.springwebapp.repository.TimeTableRepository;
import com.hbgc.springwebapp.service.TimeTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
public class TimeTableServiceImp implements TimeTableService {
    @Resource
    private TimeTableRepository timeTableRepository;

    @Override
    public List<TimeTable> findAllByUsername(String username) {
        return timeTableRepository.findAllByUsername(username);
    }

    @Override
    public void save(TimeTable timeTable) {
        timeTableRepository.save(timeTable);
    }

    @Override
    @Transactional
    public void delete(String username, Integer courseId) {
       timeTableRepository.diyDelete(username,courseId);
    }

    @Override
    public TimeTable selectByUsernameAndCourseId(String username, Integer courseId) {
        return timeTableRepository.queryByUsernameAndCourseId(username,courseId);
    }


}
