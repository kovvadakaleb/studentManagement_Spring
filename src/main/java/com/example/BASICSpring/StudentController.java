package com.example.BASICSpring;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController

public class StudentController {

    HashMap<Integer,Student> db = new HashMap<>();

    @GetMapping("/get/{id}")
    public Student getStudent(@PathVariable("id")  int regno){
        System.out.println("you receive your details"+db);
        return db.get(regno);
    }

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){


        db.put(student.getRegno(),student);
        System.out.println("current-db "+db);
        return "Student added Successfully";

    }
    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable("id") int regno){
       db.remove(regno);

        return "Student delete successfully";
    }
    @PutMapping("/updatePhone")
    public String updateStudent(@RequestBody Student student){
        db.get(student.getRegno()).setCourse(student.getCourse());
        db.get(student.getRegno()).setPhoneno(student.getPhoneno());
        return "Student Details updated Successfully";
    }
}
