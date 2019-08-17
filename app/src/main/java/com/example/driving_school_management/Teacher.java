package com.example.driving_school_management;

import java.util.List;

public class Teacher extends Person {

    private List<Student> students;

    public Teacher(int id, String password) {
        super(id, password);
    }

    public List<Student> getStudents() {
        return students;
    }
}
