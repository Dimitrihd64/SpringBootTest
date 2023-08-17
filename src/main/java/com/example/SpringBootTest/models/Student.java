package com.example.SpringBootTest.models;

import java.time.LocalDate;

public class Student {
    private Integer id;
    private String Name;
    private Integer age;
    private String email;
    private LocalDate birth;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Student(Integer id, String name, Integer age, String email, LocalDate birth) {
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
