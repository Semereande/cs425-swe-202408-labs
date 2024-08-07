package edu.miu.cs.cs425.mystudentmgmtapp.service.impl;

import edu.miu.cs.cs425.mystudentmgmtapp.model.Course;
import edu.miu.cs.cs425.mystudentmgmtapp.repository.CourseRepository;
import edu.miu.cs.cs425.mystudentmgmtapp.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }
}
