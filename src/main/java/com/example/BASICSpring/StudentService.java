package com.example.BASICSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository repository;
    public Student getStudent(int regno) {
        return repository.getStudent(regno);
    }

    public String addStudent(Student student) {
        return repository.addStudent(student);
    }

    public String updateCourse(int regno, String course) {
        return repository.updateCourse(regno,course);
    }

    public String deleteStudent(int regno) {
        return repository.deleteStudent(regno);
    }
}
