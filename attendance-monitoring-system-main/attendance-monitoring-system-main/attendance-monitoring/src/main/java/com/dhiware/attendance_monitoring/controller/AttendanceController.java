package com.dhiware.attendance_monitoring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dhiware.attendance_monitoring.entity.Attendance;
import com.dhiware.attendance_monitoring.service.AttendanceService;
@RestController
@RequestMapping("/attendance")
@CrossOrigin("*")
public class AttendanceController {

    private final AttendanceService attendanceService;

    public AttendanceController(AttendanceService attendanceService) {
        this.attendanceService = attendanceService;
    }

    @PostMapping("/{studentId}")
    public Attendance markAttendance(@PathVariable Long studentId) {
        return attendanceService.markAttendance(studentId);
    }
    @GetMapping
public List<Attendance> getAllAttendance() {
    return attendanceService.getAllAttendance();
}
}