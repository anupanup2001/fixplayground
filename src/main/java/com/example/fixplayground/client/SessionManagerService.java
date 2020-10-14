package com.example.fixplayground.client;


import org.springframework.stereotype.Service;

@Service
class SessionManagerService {
    private SessionManager sessionManager;
    SessionManagerService() {
        this.sessionManager = new SessionManager();
    }

    public void connect() {
        System.out.println("Connecting to fix session localhost");
        sessionManager.createSession();
    }

    public void disconnect() {
        System.out.println("Disconnecting from fix session localhost");
        sessionManager.disconnectSession();
    }
}
