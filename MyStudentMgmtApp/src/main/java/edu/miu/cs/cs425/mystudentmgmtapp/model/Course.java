package edu.miu.cs.cs425.mystudentmgmtapp.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "primaryKey")
    private Long courseId;
    @NonNull
    private String courseCode;
    @NonNull
    private String courseName;
    @ManyToMany(mappedBy = "course")
    private List<Student> student;

    public Course(String courseCode, String courseName) {
        this(null, courseCode, courseName, null);

    }
}
