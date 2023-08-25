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
            Student maria = new Student("maria", "maria@gmail.com",LocalDate.of(2002,Month.JANUARY,23));

        studentRepository.saveAll(List.of(maria));
        };

    }
}
