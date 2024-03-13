package com.geeks4learning.GoalManagement.Controller;

import com.geeks4learning.GoalManagement.Model.GoalManagement;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/goalManagement")
@Slf4j
public class GoalManagementController {
    @GetMapping("/{goalManagementId}")
    public GoalManagement getGoal(@PathVariable String goalManagementId) {
        log.info("Request received from the api-gateway:" + goalManagementId);
        GoalManagement goalManagement = new GoalManagement(goalManagementId, "Goal Management Details" + " " + goalManagementId);
        return goalManagement;
    }
}