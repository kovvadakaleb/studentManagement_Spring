package com.example.BASICSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    static StudentRepository repository;
    public static Student getStudent(int regno) {
        return repository.getStudent(regno);
    }

    public static String addStudent(Student student) {
        return repository.addStudent(student);
    }

    public String updateCourse(int regno, String course) {
        return repository.updateCourse(regno,course);
    }

    public String deleteStudent(int regno) {
        return repository.deleteStudent(regno);
    }
}
