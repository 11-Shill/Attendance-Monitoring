# Attendance Monitoring System - Project Status

## Current Status

The project is in a stable working state and has been pushed to Git.

### Completed Modules

#### Landing Page

* Entry point of application
* Attendance Kiosk button
* Staff Portal button

#### Staff Portal

* Lecturer login
* Dashboard
* Logout functionality

#### Student Registration

* Register new students
* Store student details in MySQL

#### Students Management

* View all students
* Search by USN
* Search by Name

#### Face Registration

* Capture face descriptor
* Link face to student

#### Attendance Kiosk

* Face Recognition using Face API.js
* Attendance marking through camera
* Fixed camera / entrance kiosk architecture

#### Attendance Tracking

* Login Time recording
* Logout Time recording
* Duplicate attendance prevention

#### Attendance Records

Displays:

* USN
* Name
* Department
* Date
* Login Time
* Logout Time
* Status

#### Reports

Displays:

* USN
* Name
* Department
* Attendance Count
* Attendance Percentage
* Regular / Defaulter Status

---

## Technology Stack

### Backend

* Spring Boot
* Spring Data JPA
* MySQL

### Frontend

* HTML
* CSS
* JavaScript

### Face Recognition

* Face API.js

---

## Important URLs

### Public

```text
/
index.html
attendance.html
```

### Staff

```text
login.html
dashboard.html
students.html
student-registration.html
attendance-records.html
reports.html
```

---

## Database Tables

### student

Stores:

* id
* usn
* name
* department
* email

### face_data

Stores:

* face descriptor
* linked student id

### attendance

Stores:

* student_id
* attendance_date
* login_time
* logout_time
* status

---

## Pending Work

### Team Member 1

Student Module

* Edit Student
* Delete Student
* Student Profile Page
* Advanced Search

### Team Member 2

Reports Module

* Export Excel
* Export PDF
* Department Filters
* Enhanced Defaulter Reports

---

## Next Major Feature

Attendance Session Management

Reason:
Current attendance is day-based.

Need to support:

* Multiple classes
* Multiple faculty
* Same classroom used by different classes
* Session-wise attendance


Attendance should later be linked to sessions.


* Attendance Kiosk is intended to run on a fixed camera system.
* Students do not require login.
* Staff access reports and records through Staff Portal.
* Current login is hardcoded and should later be moved to database-based authentication.

Last Stable Commit:
Current Git Push (Face Recognition + Login/Logout Tracking + Reports + Dashboard)
