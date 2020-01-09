package com.hbgc.springwebapp.repository;

import com.hbgc.springwebapp.domain.TimeTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface TimeTableRepository extends JpaRepository<TimeTable,Integer> {
    List<TimeTable> findAllByUsername(String username);

    @Transactional
    @Modifying
    @Query(value = "delete from timetable where username = ?1 and course_id = ?2",nativeQuery = true)
    void diyDelete(String username,Integer courseId);

    TimeTable queryByUsernameAndCourseId(String username,Integer courseId);
}
