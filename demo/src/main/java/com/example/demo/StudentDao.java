package com.example.demo;

public class StudentDao {
    public Student changeNameInDao(Student s) {
        System.out.println(s.toString() + "\n\n");
        s.setName("NO Name!");
        s.setId("100");
        return s;
    }
}
