package com.dhiware.attendance_monitoring.repository;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhiware.attendance_monitoring.entity.Attendance;

public interface AttendanceRepository
        extends JpaRepository<Attendance, Long> {

    Attendance findByStudentIdAndAttendanceDate(
            Long studentId,
            LocalDate attendanceDate
    );
}