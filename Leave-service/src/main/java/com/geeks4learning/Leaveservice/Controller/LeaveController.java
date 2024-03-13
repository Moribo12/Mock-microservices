package com.geeks4learning.Leaveservice.Controller;

import com.geeks4learning.Leaveservice.Model.Leave;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/leave")
@Slf4j
public class LeaveController {

    @GetMapping("/{leaveId}")
    public Leave getLeave(@PathVariable String leaveId) {
        log.info("Request received from the api-gateway:" + leaveId);
        Leave leave = new Leave(leaveId, "Leave Details" + " " + leaveId);
        return leave;
    }
}
