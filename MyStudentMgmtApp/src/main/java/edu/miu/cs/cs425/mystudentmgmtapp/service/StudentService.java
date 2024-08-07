package edu.miu.cs.cs425.mystudentmgmtapp.service;

import edu.miu.cs.cs425.mystudentmgmtapp.model.Student;
import org.springframework.stereotype.Service;


public interface StudentService {
    public abstract Student save(Student newstudent);
}
