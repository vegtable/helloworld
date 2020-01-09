package com.hbgc.springwebapp.repository;

import com.hbgc.springwebapp.domain.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesRepository extends JpaRepository<Courses,Integer> {

}
