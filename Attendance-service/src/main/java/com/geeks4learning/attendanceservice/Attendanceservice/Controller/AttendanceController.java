package com.geeks4learning.attendanceservice.Attendanceservice.Controller;

import com.geeks4learning.attendanceservice.Attendanceservice.Model.Attendance;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/attendance")
@Slf4j
public class AttendanceController {
    @GetMapping("/{attendanceId}")
    public Attendance getAttendance(@PathVariable String attendanceId){
        log.info("Request received from api gateway:" + attendanceId);
        Attendance attendance1 = new Attendance(attendanceId,"Attendance Details" + " " + attendanceId);
        return attendance1;
    }
}

