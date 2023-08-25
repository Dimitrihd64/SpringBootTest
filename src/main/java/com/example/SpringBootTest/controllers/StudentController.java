package com.example.SpringBootTest.controllers;

import com.example.SpringBootTest.models.Student;
import com.example.SpringBootTest.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping//("/students")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping
    public void executeCommandSAVE(@RequestBody Student student) {
        studentService.initSave(student);
        //private boolean checkBeforeSave(Student s) {}
    }
    @DeleteMapping(path = "{studentId}")
    public void executeCommandDELETE(@PathVariable("studentId")Long id){
        studentService.initDelete(id);
    }

    @PutMapping(path = "{studentId}")
    public void executeComandUPDATE(){

    }
}