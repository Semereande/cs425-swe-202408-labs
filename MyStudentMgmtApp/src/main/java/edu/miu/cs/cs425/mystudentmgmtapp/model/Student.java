package edu.miu.cs.cs425.mystudentmgmtapp.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(unique = true, nullable = false)
    @Column(name = "primarykey")
    private Long studentId;
    @Column( nullable = false)
    private long studentNumber;
    @Column( nullable = false)
    private String firstName;
    @Column( nullable = true)
    private String middleName;
    @Column( nullable = false)
    private String lastName;
    @Column( nullable = true)
    private Double gpa;
    @NonNull
    private LocalDate dateOfEnrollment;
    @OneToOne
    @JoinColumn(name = "transcript_id")
    private Transcript transcript;
    @ManyToOne
    private Classroom classroom;
    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "course_id")
    private List<Course> course;


//    public Student(long studentId, long studentNumber, String firstName, String middleName, String lastName, Double gpa, @NonNull LocalDate dateOfEnrollment, Transcript transcript, Classroom classroom, List<Course> course) {
//        this(null,studentNumber,firstName, middleName, lastName, gpa, dateOfEnrollment, null, null, null);
//    }
}

