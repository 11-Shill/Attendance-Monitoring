package com.dhiware.attendance_monitoring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dhiware.attendance_monitoring.entity.Student;
import com.dhiware.attendance_monitoring.repository.StudentRepository;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id) {
    return studentRepository.findById(id).orElse(null);
}
}