package com.example.BASICSpring;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class StudentRepository {

   static  HashMap<Integer,Student> db = new HashMap<>();
    public static Student getStudent(int regno) {
        return db.get(regno);
    }

    public static  String addStudent(Student student) {
        db.put(student.getRegno(),student);
        return "Student Data added to DataBase Successfully";
    }

    public String updateCourse(int regno, String course) {
        db.get(regno).setCourse(course);
        return "Course Updated Successfully";
    }


    public String deleteStudent(int regno) {
        db.remove(regno);
        return "Student deleted successfully";
    }
}
