package com.dhiware.attendance_monitoring.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dhiware.attendance_monitoring.entity.Attendance;
import com.dhiware.attendance_monitoring.repository.AttendanceRepository;

@Service
public class AttendanceService {

    private final AttendanceRepository attendanceRepository;

    public AttendanceService(
            AttendanceRepository attendanceRepository) {

        this.attendanceRepository = attendanceRepository;
    }

    public List<Attendance> getAllAttendance() {
        return attendanceRepository.findAll();
    }

    public Attendance markAttendance(Long studentId) {

        LocalDate today = LocalDate.now();

        Attendance attendance =
                attendanceRepository
                .findByStudentIdAndAttendanceDate(
                                studentId,
                                today
                        );

        if (attendance == null) {

            Attendance newAttendance =
                    new Attendance();

            newAttendance.setStudentId(studentId);
            newAttendance.setAttendanceDate(today);
            newAttendance.setLoginTime(
                    LocalDateTime.now()
            );
            newAttendance.setStatus("PRESENT");

            return attendanceRepository.save(
                    newAttendance
            );
        }

        if (attendance.getLogoutTime() == null) {

            attendance.setLogoutTime(
                    LocalDateTime.now()
            );

            return attendanceRepository.save(
                    attendance
            );
        }

        attendance.setStatus(
                "ALREADY_LOGGED_OUT"
        );

        return attendance;
    }
}