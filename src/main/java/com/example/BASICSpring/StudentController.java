package com.example.BASICSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/student")
public class StudentController {

   @Autowired
   StudentService service;

    @GetMapping("/get/{id}")
    public Student getStudent(@PathVariable("id")  int regno){
        return service.getStudent(regno);
    }

   @PostMapping("/add")
    public String addStudent(@RequestBody Student student) {
      return service.addStudent(student);
    }

    @PutMapping("/update-course/{course}")
    public String updateCourse(@PathVariable("course") String course,@RequestParam("q1") int regno ){
        return service.updateCourse(regno,course);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable("id") int regno){
        return service.deleteStudent(regno);
    }

}




