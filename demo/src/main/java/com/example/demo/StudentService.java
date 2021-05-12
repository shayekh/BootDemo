package com.example.demo;

public class StudentService {

    StudentDao studentDao=new StudentDao();

    public Student changeName(Student s) {
//        System.out.println(s.toString() + "\n\n");
//        s.setName("NO Name!");
        return studentDao.changeNameInDao(s);
    }
}
