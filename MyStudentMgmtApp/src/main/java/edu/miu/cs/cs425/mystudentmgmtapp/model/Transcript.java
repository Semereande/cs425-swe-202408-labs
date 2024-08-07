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
public class Transcript {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "primaryKey")
    private Long transcriptId;
    @NonNull
    private String degreeTitle;
    @OneToOne(mappedBy = "transcript", cascade = CascadeType.PERSIST)
    private Student student;

//    public Transcript( String degreeTitle) {
//        this(null,degreeTitle,null);
//
//    }
}
