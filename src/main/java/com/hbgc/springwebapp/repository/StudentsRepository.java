package com.hbgc.springwebapp.repository;

import com.hbgc.springwebapp.domain.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsRepository extends JpaRepository <Students,Integer>{
    Students queryByUsernameAndPassword(String username,String password);
    Students queryByUsername(String username);

}
