package com.example.fixplayground.client;

import quickfix.*;

import java.io.IOException;
import java.io.InputStream;

public class SessionManager {
    public void createSession() {

        InputStream inputStream = SessionManager.class.getResourceAsStream("fixconfig.cfg");
        try {
            SessionSettings settings = new SessionSettings(inputStream);
            inputStream.close();
            FixInitiator fixInitiator = new FixInitiator();
            MessageStoreFactory messageStoreFactory = new MemoryStoreFactory();
            LogFactory logFactory = new MyLog();
            MessageFactory messageFactory = new DefaultMessageFactory();
            Initiator initiator = new SocketInitiator(fixInitiator, messageStoreFactory, settings, logFactory, messageFactory);
            initiator.start();
        } catch (ConfigError | IOException configError) {
            configError.printStackTrace();
        }

    }
}
