package edu.miu.cs.cs425.mystudentmgmtapp;

import edu.miu.cs.cs425.mystudentmgmtapp.model.Classroom;
import edu.miu.cs.cs425.mystudentmgmtapp.model.Course;
import edu.miu.cs.cs425.mystudentmgmtapp.model.Student;
import edu.miu.cs.cs425.mystudentmgmtapp.model.Transcript;
import edu.miu.cs.cs425.mystudentmgmtapp.service.ClassroomService;
import edu.miu.cs.cs425.mystudentmgmtapp.service.CourseService;
import edu.miu.cs.cs425.mystudentmgmtapp.service.StudentService;
import edu.miu.cs.cs425.mystudentmgmtapp.service.TranscriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class MyStudentMgmtAppApplication implements CommandLineRunner {


	@Autowired
	private StudentService studentService;
	@Autowired
	private TranscriptService transcriptService;
	@Autowired
	private ClassroomService classroomService;
	@Autowired
	private CourseService courseService;


	public MyStudentMgmtAppApplication(StudentService studentService,
									   TranscriptService transcriptService,
									   ClassroomService classroomService,
									   CourseService courseService) {
		this.studentService = studentService;
		this.transcriptService = transcriptService;
		this.classroomService = classroomService;
		this.courseService = courseService;
	}

	public static void main(String[] args) {
		SpringApplication.run(MyStudentMgmtAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Assignment lab9");

		var stud= new Student(1L, 76L,"Anna",
				"Lynn","Smith",3.45, LocalDate.of(2019,5,24),null,null,null);
		var savedStud= studentService.save(stud);
		System.out.println(savedStud);

//        var stud1= new Student(000-61-0002,"Jane","Ray","Sune",3.85,2023/02/12);
//        var savedStud1= studentService.saveStudent(stud1);
//        System.out.println(savedStud1);

		var trans= new Transcript(1L,"BS Computer Science",null);
		var savedTrans= transcriptService.saveTranscript(trans);
		System.out.println(savedTrans);

		var classroom= new Classroom("Mclugin building","Room-52");
		var savedClassroom= classroomService.saveClassroom(classroom);
		System.out.println(savedClassroom);

		var course= new Course("CS401","Modern Prog Practices");
		var savedCourse= courseService.saveCourse(course);
		System.out.println(savedCourse);
	}
}
