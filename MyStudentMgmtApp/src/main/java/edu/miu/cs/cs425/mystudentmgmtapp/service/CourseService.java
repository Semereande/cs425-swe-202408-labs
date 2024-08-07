package edu.miu.cs.cs425.mystudentmgmtapp.service;

import edu.miu.cs.cs425.mystudentmgmtapp.model.Course;
import org.springframework.stereotype.Service;


public interface CourseService {
    public abstract Course saveCourse(Course course);
}
