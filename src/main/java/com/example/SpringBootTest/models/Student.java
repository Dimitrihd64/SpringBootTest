package com.example.SpringBootTest.models;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table
public class Student {

    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long id;
    private String Name;
    private Integer age;
    private String email;
    private LocalDate birth;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public Student(String name, Integer age, String email, LocalDate birth) {
        Name = name;
        this.age = age;
        this.email = email;
        this.birth = birth;
    }

    public Student(Long id, String name, Integer age, String email, LocalDate birth) {
        this.id = id;
        Name = name;
        this.age = age;
        this.email = email;
        this.birth = birth;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", birth=" + birth +
                '}';
    }
}
