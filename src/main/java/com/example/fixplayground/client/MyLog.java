package com.example.fixplayground.client;

import quickfix.Log;
import quickfix.LogFactory;
import quickfix.SessionID;

public class MyLog implements LogFactory, Log {

    @Override
    public Log create(SessionID sessionID) {
        return new MyLog();
    }

    @Override
    public void clear() {

    }

    @Override
    public void onIncoming(String s) {
        System.out.println("Yay - incoming: " + s);
    }

    @Override
    public void onOutgoing(String s) {
        System.out.println("Yay - outgoing: " + s);

    }

    @Override
    public void onEvent(String s) {
        System.out.println("Yay - event: " + s);

    }

    @Override
    public void onErrorEvent(String s) {
        System.out.println("Yay - error event: " + s);

    }
}
