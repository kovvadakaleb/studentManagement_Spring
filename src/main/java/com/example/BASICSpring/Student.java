package com.example.BASICSpring;

public class Student {
     private int regno;

     private String name;

     private String phoneno;

     private String course;

    public Student(){

    }

    public Student(int regno, String name, String phoneno, String course) {
        this.regno = regno;
        this.name = name;
        this.phoneno = phoneno;
        this.course = course;
    }

    public int getRegno() {
        return regno;
    }

    public void setRegno(int regno) {
        this.regno = regno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "RegNo=" + regno +
                ", Name='" + name + '\'' +
                ", PhoneNo='" + phoneno + '\'' +
                ", Course='" + course + '\'' +
                '}';
    }
}
