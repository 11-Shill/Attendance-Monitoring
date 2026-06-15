package com.dhiware.attendance_monitoring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhiware.attendance_monitoring.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}