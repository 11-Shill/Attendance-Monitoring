package com.dhiware.attendance_monitoring.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "attendance")
public class Attendance {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private Long studentId;

private String status;

private LocalDate attendanceDate;

private LocalDateTime loginTime;

private LocalDateTime logoutTime;

public Attendance() {
}

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public Long getStudentId() {
    return studentId;
}

public void setStudentId(Long studentId) {
    this.studentId = studentId;
}

public String getStatus() {
    return status;
}

public void setStatus(String status) {
    this.status = status;
}

public LocalDate getAttendanceDate() {
    return attendanceDate;
}

public void setAttendanceDate(LocalDate attendanceDate) {
    this.attendanceDate = attendanceDate;
}

public LocalDateTime getLoginTime() {
    return loginTime;
}

public void setLoginTime(LocalDateTime loginTime) {
    this.loginTime = loginTime;
}

public LocalDateTime getLogoutTime() {
    return logoutTime;
}

public void setLogoutTime(LocalDateTime logoutTime) {
    this.logoutTime = logoutTime;
}

}
