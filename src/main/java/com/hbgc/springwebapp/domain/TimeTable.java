package com.hbgc.springwebapp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="timetable")
public class TimeTable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int tid;

    private int courseId;
    private String username;
    private String courseName;
    private String teacherName;
    private String time;
    private String address;
    private String duration;
}
