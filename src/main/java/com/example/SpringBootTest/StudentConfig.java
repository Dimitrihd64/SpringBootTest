package com.example.SpringBootTest;


import com.example.SpringBootTest.Interfaces.StudentRepository;
import com.example.SpringBootTest.models.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){

        return args -> {
            Student alex = new Student("alex",21,"alexrosmmii.ar@gmail.com", LocalDate.of(2000,Month.JANUARY,5));
            Student david = new Student("david",21,"david@gmail.com", LocalDate.of(1909,Month.JANUARY,5));

        studentRepository.saveAll(List.of(alex,david));
        };

    }
}
