package com.example.SpringBootTest.services;

import com.example.SpringBootTest.models.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents(){
        return List.of(new Student(1, "alejandro", 21, "alexrosmmii.ar@gmail.com", LocalDate.of(2002, 9, 18)));

    }
}
