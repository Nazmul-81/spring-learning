package com.csbd.learnspringboot.repository;

import com.csbd.learnspringboot.model.Student;

public interface StudentRepository {
    void save(Student student);
    Student findById(int id);
}
