package com.github.hosewell.interfaces;

public interface StudentService {
    void addStudent(Student student);
    void removeStudent(Student student);
    void updateStudent(Student student);
    Student getStudent(int id);
}
