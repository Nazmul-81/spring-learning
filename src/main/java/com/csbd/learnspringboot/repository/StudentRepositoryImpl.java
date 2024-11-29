package com.csbd.learnspringboot.repository;

import com.csbd.learnspringboot.model.Student;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
@Repository
public class StudentRepositoryImpl implements StudentRepository {
    private final Map<Integer, Student> students;
    public StudentRepositoryImpl() {
        students = new HashMap<>();
    }

    @Override
    public void save(Student student) {
        students.put(student.getId(), student);
    }

    @Override
    public Student findById(int id) {
        return students.get(id);
    }
}
