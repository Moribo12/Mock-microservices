package com.geeks4learning.scheduleservice.Controller;

import com.geeks4learning.scheduleservice.Model.Schedule;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/schedule")
@Slf4j
public class ScheduleController {
        @GetMapping("/{scheduleId}")
        public Schedule getschedule(@PathVariable String scheduleId){
            log.info("Request received from the api-gateway:" + scheduleId);
            Schedule schedule = new Schedule(scheduleId,"Notification Details" + " "+ scheduleId);
            return schedule;
        }

    }
