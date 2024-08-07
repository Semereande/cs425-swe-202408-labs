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
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "primaryKey")
    private Long classroomId;
    @NonNull
    private String buildingName;
    @NonNull
    private String roomNumber;
    // @JoinColumn(name = "class_Students")
    @OneToMany(mappedBy = "classroom", cascade = CascadeType.PERSIST)
    private List<Student> studentList;

    public Classroom(String buildingName, String roomNumber) {
        this(null, buildingName, roomNumber, null);

    }
}
