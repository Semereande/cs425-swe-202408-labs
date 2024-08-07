package edu.miu.cs.cs425.mystudentmgmtapp.service;

import edu.miu.cs.cs425.mystudentmgmtapp.model.Classroom;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ClassroomService {
    public abstract Classroom saveClassroom(Classroom classroom);
}
