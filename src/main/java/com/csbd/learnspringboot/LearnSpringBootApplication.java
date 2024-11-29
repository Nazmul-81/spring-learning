package com.csbd.learnspringboot;

import com.csbd.learnspringboot.model.Student;
import com.csbd.learnspringboot.repository.StudentRepository;
import com.csbd.learnspringboot.service.FactorialService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class LearnSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnSpringBootApplication.class, args);




        /*System.out.println("Hello World!");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.csbd.learnspringboot");
        context.refresh();

        FactorialService factorialService = context.getBean(FactorialService.class);
        System.out.println(factorialService.factorial(5));

        StudentRepository studentRepository = context.getBean(StudentRepository.class);
        studentRepository.save(new Student(1, "Smith", 15));
        studentRepository.save(new Student(2, "Jhon", 16));

        System.out.println(studentRepository.findById(1));
        System.out.println(studentRepository.findById(2));*/
    }

}
