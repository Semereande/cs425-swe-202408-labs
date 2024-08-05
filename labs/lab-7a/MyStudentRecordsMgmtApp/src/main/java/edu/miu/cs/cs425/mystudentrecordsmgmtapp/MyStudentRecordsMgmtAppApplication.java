package edu.miu.cs.cs425.mystudentrecordsmgmtapp;


import edu.miu.cs.cs425.mystudentrecordsmgmtapp.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class MyStudentRecordsMgmtAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyStudentRecordsMgmtAppApplication.class, args);



    Student[] students = {
            new Student(110001, "Dave", LocalDate.of(1951, 11, 18)),
            new Student(110002, "Anna", LocalDate.of(1990, 12, 7)),
            new Student(110003, "Erica", LocalDate.of(1974, 1, 31)),
            new Student(110004, "Carlos", LocalDate.of(2009, 8, 22)),
            new Student(110005, "Bob", LocalDate.of(1994, 8, 5))
    };

    printListOfStudents(students);
    List<Student> platinumAlumni = getListOfPlatinumAlumniStudents(students);
        System.out.println("\nPlatinum Alumni Students:");
        platinumAlumni.forEach(System.out::println);

        int[] numbers = {35, 10, 7, 14, 50, 70, 15, 21};
        printHelloWorld(numbers);

        int[] nums = {1, 2, 3, 4, 5};
        System.out.println("Second biggest: " + findSecondBiggest(nums));

        int[] nums2 = {19, 9, 11, 0, 12};
        System.out.println("Second biggest: " + findSecondBiggest(nums2));
}

public static void printListOfStudents(Student[] students) {
    Arrays.stream(students)
            .sorted((s1, s2) -> s1.getName().compareTo(s2.getName()))
            .forEach(System.out::println);
}

public static List<Student> getListOfPlatinumAlumniStudents(Student[] students) {
    LocalDate thirtyYearsAgo = LocalDate.now().minusYears(30);
    return Arrays.stream(students)
            .filter(s -> s.getDateOfAdmission().isBefore(thirtyYearsAgo))
            .sorted((s1, s2) -> s2.getDateOfAdmission().compareTo(s1.getDateOfAdmission()))
            .collect(Collectors.toList());
}
    public static void printHelloWorld(int[] numbers) {
        for (int number : numbers) {
            if (number % 5 == 0 && number % 7 == 0) {
                System.out.println("HelloWorld");
            } else if (number % 5 == 0) {
                System.out.println("Hello");
            } else if (number % 7 == 0) {
                System.out.println("World");
            }
        }
    }

    public static int findSecondBiggest(int[] numbers) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > first) {
                second = first;
                first = number;
            } else if (number > second && number < first) {
                second = number;
            }
        }
        return second;
    }

}
