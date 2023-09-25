package com.example.BASICSpring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BasicSpringApplicationTests {

	@Autowired
	StudentService studentservice;

	@BeforeEach
	public void prepare(){
		Student student1 = new Student(1,"kaleb","9160201731","CSE");
		Student student2 = new Student(2,"Bujji","8341692140","EEE");
		studentservice.addStudent(student1);
		studentservice.addStudent(student2);
	}
	@Test
	public void addStudentTest(){
		Student student = new Student(1,"JHU","9160201731","CSE");
		studentservice.addStudent(student);
		Student actualOutput = student;
		Student expectedOutput = studentservice.getStudent(1);
		Assertions.assertEquals(actualOutput.getRegno(),expectedOutput.getRegno());
		Assertions.assertEquals(actualOutput.getCourse(),expectedOutput.getCourse());
		Assertions.assertEquals(actualOutput.getName(),expectedOutput.getName());
		Assertions.assertEquals(actualOutput.getPhoneno(),expectedOutput.getPhoneno());
	}

	@Test
	public void getStudentTest(){
		Student student = studentservice.getStudent(1);
		Student expected = new Student(1,"kaleb","9160201731","CSE");
		Student actual = student;
		Assertions.assertEquals(expected.getRegno(),actual.getRegno());
		Assertions.assertEquals(expected.getName(),actual.getName());
		Assertions.assertEquals(expected.getPhoneno(),actual.getPhoneno());
		Assertions.assertEquals(expected.getCourse(),actual.getCourse());

	}
	@Test
	void contextLoads() {
	}

}
