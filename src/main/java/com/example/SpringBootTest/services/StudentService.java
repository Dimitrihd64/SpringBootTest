package com.example.SpringBootTest.services;


import com.example.SpringBootTest.Interfaces.StudentRepository;
import com.example.SpringBootTest.models.Student;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public List<Student> getStudents() {
        return studentRepository.findAll();

    }

    public void initSave(Student student) {
        Optional<Student> studentOptional = studentRepository
                .findStudentByEmail(student.getEmail());
        if (studentOptional.isPresent()) {
            throw new IllegalStateException("email taken");
        }
        studentRepository.save(student);
    }

    public void initDelete(Long id) {
        boolean exists = studentRepository.existsById(id);
        if (exists) {
            studentRepository.deleteById(id);
        } else {
            throw new IllegalStateException("student with id " + id +" does not exists");
        }
    }
    @Transactional
    public void initUpdate(Long studentId,String name, String email){
        Student s = studentRepository.findById(studentId).orElseThrow(()->new IllegalStateException("student with id " + studentId +" does not exists"));

        if (name!=null && name.isEmpty() && !Objects.equals(s.getName(),name)){
            s.setName(name);
        }
        if (email!=null && email.isEmpty() && !Objects.equals(s.getEmail(),email)){
            s.setEmail(email);
        }
        if (email!=null && email.isEmpty() && !Objects.equals(s.getEmail(),email)){
            s.setEmail(email);
        }
    }
}
