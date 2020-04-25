package com.sujia.testaop;

import com.sujia.testaop.config.ComponentConfig;
import com.sujia.testaop.entity.Student;
import com.sujia.testaop.service.StudentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import javax.sql.DataSource;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentConfig.class);
        StudentService studentService = context.getBean(StudentService.class);
//        studentService.regist("sujia","123456");
        Student student =studentService.login("sujia","123456");
        System.out.println(student);
    }
}
