package edu.miu.cs.cs425.mystudentmgmtapp.service.impl;

import edu.miu.cs.cs425.mystudentmgmtapp.model.Student;
import edu.miu.cs.cs425.mystudentmgmtapp.repository.StudentRepository;
import edu.miu.cs.cs425.mystudentmgmtapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student save(Student newstudent) {
        return studentRepository.save(newstudent);
    }
}
