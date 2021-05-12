package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {
    StudentService sm=new StudentService();

    @GetMapping("hello")
    public int getHello() {
        System.out.println("fvv");
        System.out.println();
        return 5;
    }

    @GetMapping("student")
    public Student getHelloStudent() {
        return new Student("shayekh","01");
    }

    @PostMapping("student")
    public Student setStudent(@RequestBody Student student) {
//        System.out.println(student.toString()+"\n\n");
//        student.setName("NO Name!");
        return sm.changeName(student);
    }
}
