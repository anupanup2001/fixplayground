package com.example.fixplayground.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SessionManagerController {
    private SessionManagerService sessionManagerService;
    @Autowired
    SessionManagerController(SessionManagerService sessionManagerService) {
        this.sessionManagerService = sessionManagerService;
    }

    @RequestMapping("/hello")
    public String helloWorld() {
        sessionManagerService.connect();
        return "Hello World";
    }
}
