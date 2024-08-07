package edu.miu.cs.cs425.mystudentmgmtapp.service.impl;

import edu.miu.cs.cs425.mystudentmgmtapp.model.Classroom;
import edu.miu.cs.cs425.mystudentmgmtapp.repository.ClassroomRepository;
import edu.miu.cs.cs425.mystudentmgmtapp.service.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassroomServiceImpl implements ClassroomService {

    private ClassroomRepository classroomRepository;

    public ClassroomServiceImpl(ClassroomRepository classroomRepository) {
        this.classroomRepository = classroomRepository;
    }


    @Override
    public Classroom saveClassroom(Classroom classroom) {
        return classroomRepository.save(classroom);
    }
}

